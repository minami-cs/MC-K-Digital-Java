class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("MyRun");
	}
}
public class RunTest {

	public static void main(String[] args) {
		// 아래 함수들은 모두 동일식 표현
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {}
//		};
//		Thread thread = new Thread(r);
//		
//		Runnable r = () -> {System.out.println("스레드 실행");};
//		Thread thread = new Thread(() -> {System.out.println("스레드 실행");});
		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("스레드 실행");
//			}
//		}).start();
//		
//		new Thread(() -> {System.out.println("스레드 실행");}).start();
		
		MyThread thread = new MyThread();
		thread.start();  // thread는 start함수를 써야 실행된다
	}

}
