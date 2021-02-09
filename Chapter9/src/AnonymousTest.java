interface IBase {
	void method();
}

abstract class CBase {
	abstract void cmethod();
}

public class AnonymousTest {

	public static void main(String[] args) {
		IBase b = new IBase() {  // 인터페이스를 상속받아서 새로운 클래스(익명 클래스)를 오버라이드하여 생성

			@Override
			public void method() {
				System.out.println("구현 메소드");
				
			}			
		};
		b.method();  // 호출
		
		CBase c = new CBase() {

			@Override
			void cmethod() {
				System.out.println("추상 메소드도 똒같은겨?");
				
			}
			
		};
				
		c.cmethod();

	}

}
