package sec06.exam05_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		// 순서가 바뀌어도 producerthread가 먼저 실행됨
		consumerThread.start();
		producerThread.start();

	}

}
