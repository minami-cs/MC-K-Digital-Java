class A {
	class B {  // instance inner class
		B() {}  // 생성자
		int n;  // 인스턴스 필드
		void method() {}  // 인스턴스 메소드
		// static int sn; // static 필드 선언 불가능
		// static void smethod() {} // static 메소드 선언 불가능
	}
}

class C {
	// static inner class
	static class D {
		D() {}  // 생성자
		int n;  // 인스턴스 필드
		void method() {}  // 인스턴스 메소드
		static int sn;  // static 필드
		static void smethod() {}  // static 메소드
	}
}
public class InnerClassTest {
	// 밖에서는 쓸 수 없고 이 안에서만 쓸 수 있음
	public static void func() {
		class F {
			F() {}  // 생성자
			int n;  // 인스턴스 필드
			void method() {}  // 인스턴스 메소드
			// static int sn;  // static 필드 선언 불가능
			// static void smethod() {}  // static 메소드 선언 불가능
		}
		F f = new F();
		f.method();
	}

	public static void main(String[] args) {
		A a = new A();  // B가 A 안에 있기 때문에 A부터 먼저 생성해줘야 됨
		A.B b = a.new B();
		b.method();
		b.n = 10;
		
		C.D d = new C.D();  // static은 C부터 먼저 생성하지 않아도 됨
		d.n = 10;
		C.D.sn = 20;
		C.D.smethod();
	}

}
