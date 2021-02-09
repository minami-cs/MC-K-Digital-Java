class Calculator2 {
	// static이 붙어 있는 메소드는 인스턴스화되어서 외부에서 new 연산자 필요없음
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int mul(int x, int y) {
		return x*y;
	}
	
	public static double div(int x, int y) {
		return y==0? y: (double) x/y;
	}
}
public class CalculatorTest2 {

	public static void main(String[] args) {
//		Calculator2 c2 = new Calculator2(); // static이 있으면 필요없음
		System.out.println(Calculator2.add(10, 20));
		System.out.println(Calculator2.sub(40, 5));
		System.out.println(Calculator2.mul(42, 9));
		System.out.println(Calculator2.div(9, 3));

	}

}
