package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.StudentDTO;

public class StudentDAO {
	Connection conn;
	public StudentDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public int insertStudent(StudentDTO studentDTO) {
		String sql="insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt=null;
		int rcnt=0;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, studentDTO.getNo());
			pstmt.setString(2, studentDTO.getName());
			pstmt.setString(3, studentDTO.getDet());
			pstmt.setString(4, studentDTO.getAddr());
			pstmt.setString(5, studentDTO.getTel());
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
	public void printAllStudents() {
		
	}
}
