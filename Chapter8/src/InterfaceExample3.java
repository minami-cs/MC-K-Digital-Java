interface I {
	void method();
}
class A {
	
}
class B extends A {
	
}
// C와 D에만 메소드를 만들어서 사용할 때 I에 메소드를 만들어서 C와 D에서 implements해주면
class C extends B implements I {
	public void method() {}
}
class D extends A implements I {
	public void method() {}
}
public class InterfaceExample3 {
	// I의 메소드를 가져오면 C와 D 기능을 모두 가져와서 사용할 수 있음
	public static void Func(I e) {
		e.method();
	}
	public static void main(String[] args) {
		Func(new C());
		Func(new D());

	}

}
