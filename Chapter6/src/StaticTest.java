class Product {
	int serialNum = 0;
	static int snum = 100;
	public Product() {
//		serialNum++;
		snum++;
		serialNum = snum;  // 유일해야 하는 경우, static 변수를 활용할 수 있음 ex) 학번, 교직원번호 등
		System.out.println("serialNum: " + serialNum + ", snum: " + snum);
	}
}
public class StaticTest {

	public static void main(String[] args) {
		Product[] prs = new Product[5];
		for (int i=0; i<prs.length; i++) {
			prs[i] = new Product();
		}

	}

}

// result
// serialNum: 1, snum: 101
// serialNum: 1, snum: 102
// serialNum: 1, snum: 103
// serialNum: 1, snum: 104
// serialNum: 1, snum: 105
// serialNum은 계속 객체가 새로 생성되기 때문에 숫자가 1로 나오고, snum은 객체와 상관없이 클래스에 속해 있으므로(static) 숫자가 달라진다
