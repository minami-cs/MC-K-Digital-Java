
public class ThreadNameExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Thread thread1 = new ThreadA();  // 스레드 생성 시 스레드 명명해주는 방법
		System.out.println(thread1.getName());
		thread1.start();
		
		Thread thread2 = new ThreadB();
		System.out.println(thread2.getName());
		thread2.start();

	}

}
