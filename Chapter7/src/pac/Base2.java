package pac;

public class Base2 {  // final은 상속금지. String class도 상속이 안 됨.
	// overload 예시 - overload는 동일한 이름의 메소드가 여러 개 있는 것
	protected void method() {  // protected는 같은 패키지의 다른 클래스나 자식 클래스만 접근 허용
		
	}
//	public int method(int n) {
//		리턴타입이 다른 것은 오버로드 성립 불가능
//	}
	public void method(int n) {  // final 메소드: 메소드 override 금지
		
	}
	public void method(int n, int m) {
		
	}
	public void method(double d, int n) {
		
	}
	public void method(int n, double d) {
		
	}
}
