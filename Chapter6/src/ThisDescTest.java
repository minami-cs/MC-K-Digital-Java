class Number {
	int num;
	public void setNum(Number this, int num) {
		this.num = num;
	}
}
public class ThisDescTest {

	public static void main(String[] args) {
		Number n = new Number();
		n.num = 20;
		n.setNum(10);  // 실제로는 Number.setNum(n, 10);

	}

}
