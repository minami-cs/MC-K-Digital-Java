package sec01.poly;

class Person {
	int age;
	String name;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {  // 문자열로 만들어준다
		return "이름: " + name + ", 나이: " + age;
	}
}

class Student extends Person {
	String major;
	public Student() {}
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + ", 전공: " + major;
	}
	
}
class Teacher extends Person {
	String department;
	public Teacher() {}
	public Teacher(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return super.toString() + ", 부서: " + department;
	}
}

public class PolymorphTest {

	public static void main(String[] args) {
		//Person s1 = new Student("박나래", 33, "방송연예");
		//s1.getMajor();  // major는 자식에만 있어서 사용불가
		//System.out.println(s1.toString());  // 부모타입으로 up-casting을 했지만 자식클래스가 override를 했기 때문에 자식의 toString()을 가져와서 보여준다. (다형성)
		
		Person[] pers = new Person[2];
		pers[0] = new Student("박나래", 33, "방송연예");
		pers[1] = new Teacher("나문희", 53, "교육학");
		//pers[1].getDepartment();  // getter와 setter를 사용하더라도 department는 teacher에만 있어서 사용 불가
		System.out.println(pers[0].toString());
		System.out.println(pers[1].toString());
	}

}
