package var;

class Number {
	static int[] n = new int[10];
	// static 객체는 static 블록을 만들어서 초기화 가능
	static {
		for (int i=0; i<n.length; i++) {
			n[i] = (int)(Math.random()*100)+1;
		}
	}
}

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
