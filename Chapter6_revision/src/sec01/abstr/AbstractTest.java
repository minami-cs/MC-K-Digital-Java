package sec01.abstr;

abstract class Player {
	int currentPos;
	Player() {
		currentPos = 0;
	}
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
}
// abstract 함수를 상속받아서 쓰려면 상속받는 클래스가 (abstract가 되거나) override를 해야 한다
class IPlayer extends Player {

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		//Player p1 = new Player(); // abstract class는 객체 생성 불가능
		Player p2 = new IPlayer();
		p2.play();

	}

}
