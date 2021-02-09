package sec06.exam06_stop;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		
		// try나 while 둘 중 하나를 사용하면 된다
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//			}
//		} catch(InterruptedException e) {
//			System.out.println(e.getMessage());  // interrupt는 예외를 발생시켜서 강제로 빠져나가게 하므로 catch에 interrupt 발생 시 할 작업을 넣어준다.
//		} finally {
//			System.out.println("마무리 작업");
//		}
		
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				System.out.println("마무리 작업");
				break;
			}
		}
		System.out.println("마무리 작업");
	}
	
}
