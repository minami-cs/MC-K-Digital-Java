package emp;

public abstract class Employee {
	String id;
	String name;
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String info() {
		return "사번:" + id + ", 이름:" + name;
	}

	abstract public int getPay();  // abstract는 class도 abstract가 되어야 하고, body가 없어야 함, abstract는 사용자가 직접 접근하지 못함
	
	

}
