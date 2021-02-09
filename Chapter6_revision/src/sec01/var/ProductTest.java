package sec01.var;

// 유일한 값을 가지는 객체들이 공유할 때가 있다면
class Product {
	static int count = 100;
	int serialNo;
	
	public Product() {
		serialNo = count++;
		//serialNo = ++count;  // 101부터 카운트할 경우
	}
}
public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
	}

}
