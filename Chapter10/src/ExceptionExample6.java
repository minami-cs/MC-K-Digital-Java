import java.util.Scanner;

public class ExceptionExample6 {

	static Scanner sc = new Scanner(System.in);
	public static void menu() {
		int sel = Integer.parseInt(sc.nextLine());
		subMenu();
	}
	public static void subMenu() {
		int sel = Integer.parseInt(sc.nextLine());
	}
	public static void main(String[] args) {
		try {
			menu();
			//subMenu();
			//throw new Exception("내가 만든 예외");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
