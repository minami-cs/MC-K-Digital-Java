
class Card {
	String shape;
	char num;
	static int width = 40;
	static int height = 70;
	
	public Card(String shape, char num) {
		this.shape = shape;
		this.num = num;
	}
	
	public String view() {
		return "[" + shape + ", " + width + ", " + height + "]";
	}
	
}

public class CardTest {
	public static void main(String[] args) {
		Card c1 = new Card("하트", 'A');
		Card c2 = new Card("클로버", '2');
		Card c3 = new Card("스페이드", 'K');
		Card c4 = new Card("다이아몬드", 'J');
		// width와 height은 static으로 되어 있어서 한번에 다 변경 가능
		Card.width = 30;
		Card.height = 50;
		System.out.println(c1.view());
		System.out.println(c2.view());
		System.out.println(c3.view());
		System.out.println(c4.view());
	}
}
