import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnect {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;  // select문 사용할 때만 ResultSet 사용
		try {
			Class.forName("oracle.jdbc.OracleDriver");  // 드라이버 설정
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  // 오라클주소는 버전이나 계정에 따라 다름
			stmt=conn.createStatement();
			rset=stmt.executeQuery("select * from t_member");  // executeQuery는 select문을 사용할 때만 사용
			while(rset.next()) {
				String id = rset.getString("id");  // 컬럼을 가져올 때 컬럼의 데이터 타입이 VARCHAR2, CHAR 등 문자타입일 때 사용
				String name = rset.getString("name");
				System.out.println("id:"+id+", name:"+name);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// 각각 다 닫아줘야 한다
				if(conn!=null) conn.close();
				if(stmt!=null) conn.close();
				if(rset!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
