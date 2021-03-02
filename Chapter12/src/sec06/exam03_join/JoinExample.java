package sec06.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();  // sumThread가 끝날 때까지 기다리라는 뜻
		} catch(InterruptedException e) {}
		
		System.out.println("1-100 합: " + sumThread.getSum());
	}

}
