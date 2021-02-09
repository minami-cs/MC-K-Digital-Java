package sec01.var;

class SingleTon {
	private static SingleTon instance = new SingleTon();  // static메소드에서 참조되므로 static형태여야 한다.
	public static SingleTon getInstance() {  // 객체생성 없이 호출해야 하므로 static 메소드여야 한다.
		return instance;
	}
	private SingleTon() {};  // private으로 외부에서 객체 생성 불가능하게 한다
}
public class SingleTonTest {

	public static void main(String[] args) {
		//SingleTon t = new SingleTon();  // 객체 생성 불가하다. 생성자가 private이기 때문에.
		SingleTon t1 = SingleTon.getInstance();
		SingleTon t2 = SingleTon.getInstance();  // t2와 t1은 동일한 객체 참조
	}

}
