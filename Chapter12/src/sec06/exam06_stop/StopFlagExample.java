package sec06.exam06_stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		printThread.setStop(true);
		//printThread.stop(); // 갑자기 실행중단됨. stop은 사용하지 않길 권고함
	}

}
