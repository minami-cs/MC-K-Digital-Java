package sec01.var;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
public class CardTest {

	public static void main(String[] args) {
		System.out.println(Card.width);  // static 변수는 클래스명.클래스변수로 접근
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 9;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 2;
		
		System.out.println(c1.kind + ":" + c1.number + ":" + c1.width + ":" + c1.height);  // 인스턴스 변수명으로도 static 변수에 접근 가능
		System.out.println(c2.kind + ":" + c2.number + ":" + c2.width + ":" + c2.height);

		c1.width = 50;  // 인스턴스 변수명을 통해서도 static 변수의 값을 일괄 변경할 수 있음
		c1.height = 80;
		
		System.out.println(c1.kind + ":" + c1.number + ":" + c1.width + ":" + c1.height);
		System.out.println(c2.kind + ":" + c2.number + ":" + c2.width + ":" + c2.height);
	}

}
