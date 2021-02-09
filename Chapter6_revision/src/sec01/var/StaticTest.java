package sec01.var;

class MyClass {
	int iv;
	static int sv;
	
	void imethod2() {}
	void imethod() {  // 인스턴스 메소드
		System.out.println(iv);  // instance variable access ok
		System.out.println(sv);  // static variable access ok
		imethod2();  // 다른 인스턴스 메소드 호출 가능
		smethod();  // static 메소드 호출 가능
	}
	static void smethod() {  // static method
		//System.out.println(iv);  // instance variable access x
		System.out.println(sv);  // static variable access ok
		//imethod();  // 인스턴스 메소드 호출 불가능
		smethod2();  // 또다른 static 메소드는 호출 가능
	}
	static void smethod2() {}
}
public class StaticTest {

	public static void main(String[] args) {
		MyClass.smethod();  // 클래스명으로 호출 가능

//		int x = 10; y;
//		y = x;
//		y = 10;
	}

}
