package sec03;

@FunctionalInterface
interface MyFunctionalInterface {
	public void method(int x);
	//public void method2();
}
public class LambdaTest {

	public static void main(String[] args) {
		int y = 10;  // final 생략되어 있지만 final 변수
		// y++; // 로컬 클래스 안에서 쓰려면 final 변수여야 한다.
		MyFunctionalInterface nfi = new MyFunctionalInterface() {
			// 익명이면서 로컬 클래스
			@Override
			public void method(int x) {
				System.out.println(y);  // 지역 클래스 내부 또는 밖에서 final 변수에 변화를 주면 컴파일 에러
			}
		};
		nfi.method(100);
		// 위와 같은 식인데 아래처럼 람다식으로 하면 코드가 간결해짐
		MyFunctionalInterface nf = (x) -> {System.out.println(x);};
		nf.method(100);
		
		Runnable r = () -> { System.out.println("A"); };
		Thread t = new Thread();
		t.start();
	}

}
