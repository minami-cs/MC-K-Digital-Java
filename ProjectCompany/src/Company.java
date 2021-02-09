import emp.BusinessTrip;
import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class Company {
	Employee[] emps = new Employee[100];
	int empCnt;
	
	public void addEmployee(Employee emp) {  // up-casting 가능
		emps[empCnt++] = emp;
	}
	
	public void empList() {
		for (int i=0; i<empCnt; i++)
			System.out.println(emps[i].info());
	}
	
	public int getTotEmpPay() {
		int tot = 0;
		for (int i=0; i<empCnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
	}
	
	public void regBusinessTrip(BusinessTrip emp, int day) {
		emp.goBusinessTrip(day);
		
	}

	public static void main(String[] args) {
//		Employee e = new Employee("100", "나사원");  // 추상 클래스이기 때문에 객체 생성 불가능
		Company com = new Company();
		Permanent e1 = new Permanent("101", "김과장", 4000000);
		Sales e2 = new Sales("102", "박대리", 1000000, 2000000);
		PartTime e3 = new PartTime("103", "홍차장", 160, 10000);
		com.addEmployee(e1);
		com.addEmployee(e2);
		com.addEmployee(e3);
		
		//com.regBusinessTrip(e1, 3);  // 불가능하게
		com.regBusinessTrip(e2, 2);  // 가능하게
		com.regBusinessTrip(e3, 3);  // 가능하게
		
		com.empList();
		System.out.println();
		System.out.println("총 급여액: " + com.getTotEmpPay());
//		Employee e1 = new Employee("1001","김과장",3000000);
//		Employee e2 = new Employee("1002","박대리",2000000);
//		Employee e3 = new Employee("1003","홍차장",4000000);
//		System.out.println(e1.info());
//		System.out.println(e2.info());
//		System.out.println(e3.info());
//		System.out.println();
//		System.out.println(e1.getPay());
//		System.out.println(e2.getPay());
//		System.out.println(e3.getPay());


	}

}
