package assignment1;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc = "";

	@Override
	public String toString() {
		return isbn + "  | " + title + "  | " + author + "  | " + publisher + "  | " + price + " " + desc;
	}
}
