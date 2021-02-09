package forwhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 자동 import는 ctrl+shift+o, 콘솔에 입력된 문자열 한번에 읽어오기
		int sum = 0;
//		while (true) {
//			String input = sc.nextLine();
//			int n = Integer.parseInt(input);
//			if (n == 0) break;
//			sum += n;  // 문자열의 숫자를 정수로 바꿔줌
//		}
//		System.out.println(sum);
		
		int n;
		do {  // 반복 처리를 먼저 하고 조건 비교
			String input = sc.nextLine();
			n = Integer.parseInt(input);
			sum += n;
		} while (n != 0);
		System.out.println(sum);

	}

}
