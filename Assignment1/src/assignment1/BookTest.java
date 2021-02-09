package assignment1;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.isbn = "21424";
		book1.title = "Java Pro";
		book1.author = "김하나";
		book1.publisher = "Jaen.kr";
		book1.price = 15000;
		book1.desc = "기본문법";
		
		Book book2 = new Book();
		book2.isbn = "35355";
		book2.title = "OOAD 분석, 설계";
		book2.author = "소나무";
		book2.publisher = "Jaen.kr";
		book2.price = 30000;
		
		Magazine magazine1 = new Magazine();
		magazine1.isbn = "35535";
		magazine1.title = "Java World";
		magazine1.author = "편집부";
		magazine1.publisher = "androidjava.com";
		magazine1.price = 7000;
		magazine1.year = 2013;
		magazine1.month = 2;
		System.out.println("*********************** 도서목록 ***********************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(magazine1.toString());

	}

}
