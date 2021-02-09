
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// synchronized: 하나의 스레드가 호출하면 다른 스레드는 이미 실행되고 있는 스레드가 끝날 때까지 대기한다. (동기화)
	public void setMemory(int memory) {  
		synchronized(this) {  // int일 때는 이렇게 사용하기도 하고, 복잡한 코드일 때는 해당 부분만 synchronized 블록으로 감싸주기도 한다. Calculator 객체 자체를 동기화해주는 것이므로 this를 동기화
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
	}
	
}
