package forwhile;

public class ContinueExample {

	public static void main(String[] args) {
		// 1 - 100 중 3의 배수가 아닌 수의 합
		int sum = 0;
//		for (int i=1; i<=100; i++) {
//			if (i%3!=0) {  // i가 3의 배수가 아닌 경우 
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		for (int i=1; i<=100; i++) {
			if (i%3==0) continue;  // 증감식으로 바로 이동하여 계속 처리 = 3의 배수는 건너뛰기
			sum += i;
		}
		System.out.println(sum);

	}

}
