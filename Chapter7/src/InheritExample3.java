class Base {
	public Base() {
		System.out.println("Base constructor");
	}
	
	public Base(int n) {
		System.out.println("n Base constructor");
	}
}

class Derived extends Base {
	public Derived() {
		super(10);  // 부모 생성자 호출이 먼저 이루어지기 때문에 맨 처음에 써줘야 한다
		System.out.println("Derived constructor");
		
	}
}

public class InheritExample3 {

	public static void main(String[] args) {
		Derived d = new Derived();
	}

}
