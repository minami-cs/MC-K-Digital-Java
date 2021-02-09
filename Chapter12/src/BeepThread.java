import java.awt.Toolkit;

public class BeepThread extends Thread {  // 다른 클래스의 기능을 상속받을 수 없음(단일상속만 가능하기 때문)

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
	
}
