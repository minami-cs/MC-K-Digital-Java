package Practice6;

public class Chatting {
	void startChat(String chatId) {
		final String nickName = chatId;  // final 변수만 메소드 내부에서 사용 가능
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
