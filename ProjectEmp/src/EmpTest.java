import java.util.List;

import dao.EmpDAO;
import dto.EmpDTO;

public class EmpTest {

	public static void insertEmp() {
		EmpDTO emp = new EmpDTO();
		emp.setEmpno(9000);
		emp.setEname("DOUG");
		emp.setJob("RESEARCH");
		emp.setMgr(7839);
		emp.setSal(3000);
		emp.setDeptno(20);
		EmpDAO dao = new EmpDAO();
		dao.insertEmp(emp);
		dao.connectClose();
	}
	public static void queryEmp() {
		EmpDAO dao = new EmpDAO();
		EmpDTO emp = dao.queryEmp(9000);
		dao.connectClose();
		System.out.println(emp.getEname());
	}
	public static void queryEmps() {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.queryEmps(20);
		dao.connectClose();
		for(EmpDTO e : list) {
			System.out.println(e.getEmpno()+":"+e.getEname());
		}
	}
	public static void queryEmpsByDname() {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.queryEmps("RESEARCH");
		dao.connectClose();
		for(EmpDTO e : list) {
			System.out.println(e.getEmpno()+":"+e.getEname());
		}
	}
	public static void queryAllEmps() {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.queryEmps();
		dao.connectClose();
		for(EmpDTO e : list) {
			System.out.println(e.getEmpno()+":"+e.getEname());
		}
	}
	public static void deleteEmp() {
		EmpDAO dao = new EmpDAO();
		dao.deleteEmp(9000);
		dao.connectClose();
		System.out.println("삭제 완료");
	}
	public static void main(String[] args) {
		//insertEmp();
		//queryEmp();
		//queryEmps();
		//queryAllEmps();
		//queryEmpsByDname();
		deleteEmp();
	}

}
