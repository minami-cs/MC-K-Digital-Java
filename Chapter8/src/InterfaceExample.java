
public class InterfaceExample {
	public static void sayHello(MessageBean bean) {  // up-casting
		bean.sayHello("Java");
	}
	public static void main(String[] args) {
		// MessageBean mb = new MessageBean(); => interface는 생성 불가
		sayHello(new MessageBeenEn());
//		mb.sayHello("Java");
	}
}
