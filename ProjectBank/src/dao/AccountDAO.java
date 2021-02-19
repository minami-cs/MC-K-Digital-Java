package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Exp.AccountException;
import Exp.BankExpCode;
import acc.Account;
import acc.SpecialAccount;

public class AccountDAO {
	Connection conn;
	public AccountDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// connection close를 따로 클래스로 만듦으로써 여러 statement를 사용할 때에 매번 따로 닫을 필요가 없음
	public void connectionClose() {
		try {
			if(conn!=null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public int insertAccount(Account acc) {
		String sql="insert into account values(?,?,?,?)";
		PreparedStatement pstmt=null;
		int rcnt=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, acc.getId());
			pstmt.setString(2, acc.getOwner());
			pstmt.setInt(3, acc.getBalance());
			if(acc instanceof SpecialAccount) {
				pstmt.setString(4, ((SpecialAccount)acc).getGrade());
			} else {
				pstmt.setString(4, null);
			}
			rcnt=pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rcnt;
	}
	// queryAccount는 사용자가 편리하게 사용할 수 있도록 객체로 생성해서 리턴해준다.
	public Account queryAccount(String id) {
		String sql="select * from account where id=?";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Account acc=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				String grade=rs.getString(4);
				if(grade!=null) {
					acc = new SpecialAccount();
					((SpecialAccount)acc).setGrade(grade);
				} else {
					acc=new Account();
				}
				acc.setId(rs.getString(1));
				acc.setOwner(rs.getString(2));
				acc.setBalance(rs.getInt(3));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return acc;
	}
	public ArrayList<Account> queryAllAccounts() {
		String sql="select * from account";
		Statement stmt = null;
		ResultSet rs=null;
		ArrayList<Account> accs = new ArrayList<>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				Account acc;
				String grade = rs.getString(4);
				if(grade!=null) {
					acc = new SpecialAccount();
					((SpecialAccount)acc).setGrade(grade);
				} else {
					acc = new Account();
				}
				acc.setId(rs.getString(1));
				acc.setOwner(rs.getString(2));
				acc.setBalance(rs.getInt(3));
				accs.add(acc);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return accs;
	}
	public ArrayList<Account> queryAccounts() {
		String sql = "select * from account where grade is null";
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Account> accs = new ArrayList<>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				Account acc;
				acc = new Account();
				acc.setId(rs.getString(1));
				acc.setOwner(rs.getString(2));
				acc.setBalance(rs.getInt(3));
				accs.add(acc);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return accs;
	}
	public ArrayList<SpecialAccount> querySpecialAccounts() {
		String sql = "select * from account where grade is not null";
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<SpecialAccount> accs = new ArrayList<>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				SpecialAccount acc;
				acc = new SpecialAccount();
				acc.setId(rs.getString(1));
				acc.setOwner(rs.getString(2));
				acc.setBalance(rs.getInt(3));
				acc.setGrade(rs.getString(4));
				accs.add(acc);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return accs;
	}
	// 반드시 DAO에 넣어둘 필요는 없음. bank의 account에서 써도 괜찮음.
	public boolean depositAccount(String id, int money) throws AccountException {
		Account acc = queryAccount(id);
		if(acc==null) {
			throw new AccountException(BankExpCode.NOT_ACC);
		}
		acc.deposit(money);
		int rcnt=updateAccount(acc);
		if(rcnt>0) return true;
		return false;
	}
	public boolean withdrawAccount(String id, int money) throws AccountException {
		//계좌 조회
		Account acc = queryAccount(id);
		//계좌번호 오류 체크
		if(acc==null) {
			throw new AccountException(BankExpCode.NOT_ACC);
		}
		//계좌 객체에 출금 호출
		acc.withdrawal(money);
		//출금한 금액으로 db변경
		int rcnt=updateAccount(acc);
		if(rcnt>0) return true;
		return false;
	}
	public int updateAccount(Account acc) {
		String sql = "update account set balance=? where id=?";
		PreparedStatement pstmt = null;
		int rcnt = 0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, acc.getBalance());
			pstmt.setString(2, acc.getId());
			rcnt=pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		};
		return rcnt;
	}
	//계좌이체는 자동커밋하지 않도록 해서 중간에 문제가 생기면 rollback, 정상적으로 모두 처리가 되면 commit되도록 해야 한다.
//	public boolean transferAccount(String sid, String rid, int money) {
//		try {
//			conn.setAutoCommit(false);
//			boolean success = withdrawAccount(sid,money);
//			if(success==false) {
//				conn.rollback();
//				return false;
//			}
//			success = depositAccount(rid,money);
//			if(success==false) {
//				conn.rollback();
//				return false;
//			}
//			conn.commit();
//		} catch(SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				//계좌이체 성공 시 오토커밋
//				conn.setAutoCommit(true);
//			} catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return true;
//	}
}

