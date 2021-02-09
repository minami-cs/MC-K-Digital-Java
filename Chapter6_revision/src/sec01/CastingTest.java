package sec01;

class A {}
class B extends A {}
class C extends A {}
public class CastingTest {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A a1 = new B();
		A a2 = new C();
		B b1 = (B) a1;
		C c1 = (C) a2;
		//B b2 = (B) c;  // 형제끼리는 캐스팅 불가능
		//B b2 = (B) new A();  // 컴파일 에러는 나지 않지만 잘못됨
		
		char ch = 'A';  // char는 작은 따옴표
		String str = "A";  // String은 큰 따옴표
		char[] chs = {'A', 'B', 'C'};
		int[] ar = new int[0];
		// ar[0] = 100;  // 이 코드가 없으면 실행 오류나 컴파일 오류 없음
		int Apple, apple, _a;
	}

}
