class A {}
class B extends A {}
class C extends A {}
public class ExceptionExample4 {

	public static void main(String[] args) {
		A a = new B();
		try {
			C c = (C)a;
		} catch (ClassCastException e) {
			System.out.println("Cast failed");
		}
	}

}
