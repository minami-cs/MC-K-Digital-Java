package forwhile;

public class BreakExample {

	public static void main(String[] args) {
		// 1부터 1씩 증가하는 숫자의 합을 구하다가 합의 크기가 100이상이 될 때의 i의 값 구하기
		int sum = 0;
		int i;
		for (i=1;;i++) {  // while (true) = for (;;)
			sum += i;
			if (sum>=100) break;
		}
		System.out.println("Sum: " + sum + ", i: " + i);

	}

}
