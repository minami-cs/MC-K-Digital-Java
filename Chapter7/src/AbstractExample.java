abstract class MyObject {
	int n;
	public void method1() {}
	public abstract void method2();
}

class YourObject extends MyObject {  // 추상 클래스를 상속받으려면 자식 클래스도 추상 클래스여야 한다.

	@Override
	public void method2() {  // 자식 클래스를 추상 클래스로 하지 않으려면 추상메소드를 override해서 구현해야 한다.
		// TODO Auto-generated method stub
		
	}  
	
}

public class AbstractExample {

	public static void main(String[] args) {
//		MyObject mo = new MyObject();  // 추상 클래스는 인스턴스화(객체) 불가능
		YourObject yo = new YourObject();  // 상속받아서 추상메소드를 구현한 클래스는 인스턴스화 가능

	}

}
