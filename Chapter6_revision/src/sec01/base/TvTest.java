package sec01.base;
class TV {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
public class TvTest {
	public static void method(TV t) {}
	public static void main(String[] args) {
		TV t;  // TV 인스턴스를 참조하기 위한 변수 선언
		t = new TV();  // 인스턴스를 생성하여 참조변수에 넣는다.
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		
		TV t2 = new TV();
		t2.channel = 9;
		System.out.println("현재 채널은 " + t2.channel + " 입니다.");
		
		t2=t;
		System.out.println("현재 채널은 " + t2.channel + " 입니다.");
		
		t.channelUp();
		System.out.println("현재 채널은 " + t2.channel + " 입니다.");
		
		method(t);
	}

}
