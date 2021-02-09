package Pracice5;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();  // 자전거
		anony.method1();  // 승용차
		anony.method2(new Vehicle() {  // 트럭

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
			
		});

	}

}
