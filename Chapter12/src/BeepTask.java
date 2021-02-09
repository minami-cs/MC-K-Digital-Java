import java.awt.Toolkit;

public class BeepTask implements Runnable {  // 다른 클래스의 기능을 상속받을 수 있다

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
