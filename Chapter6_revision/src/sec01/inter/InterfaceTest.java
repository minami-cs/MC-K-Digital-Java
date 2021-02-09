package sec01.inter;

class Unit {}

@FunctionalInterface  // annotation은 컴파일러에서 에러 체크하도록 정보 제공
interface Moveable {
	void move(int x, int y);
}
interface Attackable {
	void attack();
}
class Fighter extends Unit implements Moveable, Attackable {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}	
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		Attackable f1 = new Fighter();  // 구현한 객체를 interface 참조변수에 가질 수 있다.
		f1.attack();
		//f1.move();  // Attackable에는 move함수가 없어서 불가능
		Moveable f2 = new Fighter();
		f2.move(10, 10);
		//f2.attack();  // Moveable에는 attack함수가 없어서 불가능
		Unit f3 = new Fighter();
		//f3.attack();
		//f3.move(20,29=0);  // Unit에는 attack과 move함수 둘 다 없어서 불가능
	}

}
