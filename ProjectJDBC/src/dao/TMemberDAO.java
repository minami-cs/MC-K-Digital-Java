package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.TMemberDTO;

public class TMemberDAO {
	Connection conn;
	public TMemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// 특정 데이터만 가져오기
	public TMemberDTO queryTMember(String id) {
		PreparedStatement pstmt=null;
		ResultSet rset = null;
		TMemberDTO member=null;
		String sql="select id,pwd,name,email,to_char(joindate,'RR/MM/DD') from t_member where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rset=pstmt.executeQuery();
			if(rset.next()) {
				member = new TMemberDTO();
				member.setId(rset.getString(1));
				member.setPwd(rset.getString(2));
				member.setName(rset.getString(3));
				member.setEmail(rset.getString(4));
				member.setJoindate(rset.getString(5));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset!=null) rset.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return member;
	}
	// 데이터 전체 호출
	public ArrayList<TMemberDTO> queryTMembers() {
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select id,pwd,name,email,to_char(joindate,'RR/MM/DD') from t_member";
		ArrayList<TMemberDTO> list = new ArrayList<TMemberDTO>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				TMemberDTO mem = new TMemberDTO();
				mem.setId(rs.getString(1));
				mem.setPwd(rs.getString(2));
				mem.setName(rs.getString(3));
				mem.setEmail(rs.getString(4));
				mem.setJoindate(rs.getString(5));
				list.add(mem);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 닫을 때는 거꾸로 닫아주기
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	// 데이터 삽입
	public int insertTMember(TMemberDTO member) {
		String sql = "insert into t_member values(?,?,?,?,?)";  // ?에는 실제 데이터가 들어간다.
		PreparedStatement pstmt=null;
		int rcnt=0;
		try {
			pstmt=conn.prepareCall(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPwd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getJoindate());
			// 데이터를 삽입하는 것이기 때문에 executeUpdate를 사용해야 한다.
			rcnt=pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 닫을 때는 거꾸로 닫아주기
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rcnt;
	}
	// 데이터 변경
	public int updateTMemberPwd(String id, String pwd) {
		String sql="update t_member set pwd=? where id=?";
		PreparedStatement pstmt = null;
		int rcnt=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, pwd);
			pstmt.setString(2, id);
			rcnt=pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rcnt;
	}
	// 데이터 삭제
	public int deleteTMember(String id) {
		String sql="delete from t_member where id=?";
		PreparedStatement pstmt = null;
		int rcnt=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rcnt=pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rcnt;
	}
}
