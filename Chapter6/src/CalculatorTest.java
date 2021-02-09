class Calculator {
	int val1;
	int val2;
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public int add() {
		int sum = val1 + val2;
		return sum;
	}
	
	public int sub() {
		return val1 - val2;
	}
	
	public int mul() {
		return val1 * val2;
	}
	
	public double div() {
		return val2==0? 0:(double)val1/val2;
	}
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(30, 10);
		System.out.println(c1.add());  // 30
		System.out.println(c1.sub());  // 10
		System.out.println(c1.mul());  // 200
		System.out.println(c1.div());  // 2

	}

}
