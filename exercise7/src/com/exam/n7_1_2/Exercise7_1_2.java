package com.exam.n7_1_2;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			//0:1, 1:2, 2:3, ... 9:10, 10:1
			int num = i%10+1;
			boolean isKwang = (i<10) && (num==1 || num==3 || num==8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	void shuffle() {
		for(int i=0; i<=cards.length; i++) {
			int idx1 = (int)(Math.random() * cards.length);
			int idx2 = (int)(Math.random() * cards.length);
			
			SutdaCard temp;
			temp = cards[idx1];
			cards[idx1] = cards[idx2];
			cards[idx2] = temp;
		}
	}
	SutdaCard pick(int index) {
		if(index<0 || index>=CARD_NUM) {
			return null;
		}
		return cards[index];
	}
	SutdaCard pick() {
		int idx = (int)(Math.random() * cards.length);
		return cards[idx];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	public SutdaCard() {
		
	}
	public SutdaCard(int num, boolean isKwang) {
		this.num=num;
		this.isKwang=isKwang;
	}
	@Override
	public String toString() {
		return num+(isKwang?"K":"");
	}
	
}
public class Exercise7_1_2 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		/*
		 * for(int i=0; i<deck.cards.length; i++) {
		 * System.out.println(deck.cards[i]+","); }
		 */
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
			System.out.println();
			System.out.println(deck.pick(0));
		}
	}

}
