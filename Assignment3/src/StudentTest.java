import java.util.List;

import dao.StudentDAO;
import dto.StudentDTO;

public class StudentTest {

	public static void insertStudent() {
		StudentDTO std = new StudentDTO();
		std.setNo(3);
		std.setName("나길동");
		std.setDet("영문학과");
		std.setAddr("제주");
		std.setTel("010-3333-3333");
		StudentDAO dao = new StudentDAO();
		dao.insertStudent(std);
	}
	public static void printAllStudents() {
		StudentDAO dao = new StudentDAO();
		List<StudentDTO> list = dao.printAllStudents();
		for(StudentDTO s : list) {
			System.out.println(s.toString());
		}
	}
	public static void main(String[] args) {
		insertStudent();
		printAllStudents();
	}

}
