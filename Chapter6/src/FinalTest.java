class MyClass {
	static final int num = 20;  // 선언과 동시에 반드시 초기화, 변경 불가능한 값이기 때문에 static으로 선언하는 것이 합리적
	public MyClass(int num) {
		// this.num = num;  클래스 내 final 변수는 생성자나 메소드에서 변경 불가
	}
}
public class FinalTest {

	public static void main(String[] args) {
		final int num = 10;  // 상수: 변경X, 반드시 선언과 동시에 초기화
		int num2 = 30;
		num2 = 50;
		final int num3;
		num3 = 20;
		// num3 = 60; 이미 윗줄에서 초기화했으므로 다시 초기화 불가능

	}

}
