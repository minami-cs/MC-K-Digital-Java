package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.StudentDTO;

public class StudentDAO {
	Connection conn;
	public StudentDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
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
	public ArrayList<StudentDTO> printAllStudents() {
		String sql="select * from student";
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<StudentDTO> stds = new ArrayList<>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				StudentDTO std = new StudentDTO();
				std.setNo(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setDet(rs.getString(3));
				std.setAddr(rs.getString(4));
				std.setTel(rs.getString(5));
				stds.add(std);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return stds;
	}
}
