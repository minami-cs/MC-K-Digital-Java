package var;

class MyClass {
	int num;
	public MyClass() {}  // 기본 생성자
	public MyClass(int num) {  // 매개변수가 있는 생성자를 만들면 기본 생성자가 자동 생성되지 않는다. 반드시 기본 생성자 코딩해야 함.
		this.num = num;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
	}
}
