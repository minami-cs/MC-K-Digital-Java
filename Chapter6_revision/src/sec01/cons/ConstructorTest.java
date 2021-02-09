package sec01.cons;

class Person {
	Person() {}  // 기본 생성자만 있을 때는 굳이 적어주지 않아도 자동생성되지만
	Person(int age) {}  // 생성자를 만들면 기본 생성자를 반드시 써줘야 한다.
	Person(int age, String name) {}  // 오버로딩
}
public class ConstructorTest {

	public static void main(String[] args) {  // main함수에는 String[] args가 반드시 있어야 실행된다. 없으면 컴파일 에러는 나지 않지만 실행이 안 됨
		Person p1 = new Person();  // 생성자를 추가하면 기본 생성자는 자동생성되지 않는다.
		Person p2 = new Person(20);
		Person p3 = new Person(40, "이서진");

	}

}
