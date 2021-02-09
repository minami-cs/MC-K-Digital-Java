class Person {  // 부모 클래스가 final class면 상속 불가
	int age;
	String name;
	public Person() {}  // 기본 생성자를 만들어줘야됨
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String info() {
		return "이름: " + name + ", 나이: " + age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Student extends Person {
	String major;
	
	public Student(int age, String name, String major) {
		super(age, name);
//		this.age = age;
//		this.name = name;
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override  // Source -> Override로 부모 클래스 요소 중 오버라이드 할 것 선택
	public String info() {  // 부모 메소드 재정의
		// TODO Auto-generated method stub
		return super.info()+", 전공: " + major;  // major 출력하게 만들어주기
	}
	
}

class Professor extends Person {
	String department;
	public Professor() {}
	public Professor(int age, String name, String department) {
		super(age, name);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override  // Source -> Override로 부모 클래스 요소 중 오버라이드 할 것 선택
	public String info() {  // 부모 메소드 재정의
		// TODO Auto-generated method stub
		return super.info()+", 부서: " + department;
	}
}

public class InheritExample {
	static Person[] pers = new Person[10];

	public static void main(String[] args) {
//		Student s = new Student(20, "정윤호", "연극영화학과");
//		System.out.println(s.info());  // 부모 클래스는 자식 클래스를 모르기 때문에 major는 출력 안 됨
//		Person p = new Student(20, "정윤호", "연극영화학과");  // 자식 객체를 부모타입의 변수에 넣을 수 있음: up-casting
//		Student s2 = (Student) p;  // 부모타입의 객체를 자식 타입 변수에 넣기: down-casting
		
		pers[0] = new Student(32, "정윤호", "실용음악학과");
		pers[1] = new Student(30, "최창민", "연극영화학과");
		pers[2] = new Professor(53, "이수만", "경영학과");
		
//		Person p = new Student(32, "정윤호", "실용음악학과");
//		System.out.println(p.info());  // 다형성: 상속, 오버라이드했으므로 부모인 Person을 써도 결과는 자식이 Override한 것으로 나타난다.
		
//		for (int i=0; i<3; i++) {
//			System.out.println(pers[i].info());  // 다형성: student는 student, professor는 person의 info()가 호출됨. professor도 따로 major 추가해야됨
//		}
		
		for (int i=0; i<3; i++) {
			if (pers[i] instanceof Student) {
				Student s = (Student) pers[i];
				System.out.println(s.getMajor());
			}
		}
		
		for (int i=0; i<3; i++) {
			if (pers[i] instanceof Professor) {
				Professor p = (Professor) pers[i];
				System.out.println(p.getDepartment());
			}
		}
	}

}
