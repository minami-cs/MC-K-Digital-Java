package assignment1;

public class Magazine {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc = "";
	int year;
	int month;
	
	@Override
	public String toString() {
		return isbn + "  | " + title + "   " + author + "  | " + publisher + "  | " + price + " " + desc + "  | " + year + "." + month;
	}
}
