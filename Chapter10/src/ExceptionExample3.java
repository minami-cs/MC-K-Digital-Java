import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel;
		while(true) {
			try {
				System.out.println("숫자 입력>> ");
				sel = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력이 가능합니다.");
			}
		}
		System.out.println("프로그램 종료");

	}

}
