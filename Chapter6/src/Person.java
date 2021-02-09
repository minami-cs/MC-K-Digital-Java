
public class Person {
	int age;
	String name;
	
	// 메소드마다 Person this가 자동으로 들어가 있다. ex) public Person(Person this)
	public Person() {  // 생성자: new 연산으로 자돈 호출되는 함수
		this("none", 0);  // this(): 또 다른 생성자 호출, 생성자에서만 호출 가능
	}
	
	public Person(String name, int age) {  // 생성자는 매개변수의 갯수나 타입이 다르면 여러 개 올 수 있다(Overload)
		this.name = name;  // this는 클래스
		this.age = age;
	}
	
//	public Person(String id, int age) {
//		// 오버로드 성립하지 않음. 매개변수 타입과 갯수가 같은 것이 있어서
//	}
	
	public Person(String name) {  // name만 변경
		this(name, 0);
	}
	
//	public Person(String id) {
//		// 오버로드 성립X 매개변수 타입과 갯수가 같은 것이 있어서
//	}
	
	public Person(int age) {  // age만 변경
		this("none", age);
	}
	
	public String info() {
		return "이름: " + name + ", 나이:" + age;  // this.name, this.age라고 하면 더 명확하지만 this 생략해도 괜춘
	}
}
