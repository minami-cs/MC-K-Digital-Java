
public class LottoExample {

	public static void main(String[] args) {
		// 1. 정수값 저장할 배열 선언 및 할당
		int[] lotto = new int[46];
		// 2. 1번에서 할당한 배열에 1 - 45 값 넣기
		for (int i = 1; i < lotto.length; i++) {
			lotto[i] = i;
		}
		// 3. 1 - 45 중 랜덤값 2개 구해서 배열 값 바꾸기 (1000번 반복)
		for (int i = 0; i < 1000; i++) {
			int temp1 = (int)(Math.random() * 45) + 1;
			int temp2 = (int)(Math.random() * 45) + 1;
			
			int temp;
			temp = lotto[temp1];
			lotto[temp1] = lotto[temp2];
			lotto[temp2] = temp;
		}
		// 4. 배열의 요소 중 앞에서 6개 숫자를 로또 당첨 번호로 출력
		for (int i = 1; i <= 6; i++) {
			System.out.println(lotto[i]+" ");
		}
		
//		// 강사님 답
//		// 1. 정수값 저장할 배열 선언 및 할당
//		int[] num = new int[46];
//		// 2. 1번에서 할당한 배열에 1 - 45 값 넣기
//		for (int i=1; i<num.length; i++) {
//			num[i] = i;
//		}
//		// 3. 1 - 45 중 랜덤값 2개 구해서 배열 값 바꾸기 (1000번 반복)
//		for (int i = 0; i < 1000; i++) {
//			int rxn1 = (int)(Math.random()*45)+1;
//			int rxn2 = (int)(Math.random()*45)+1;
//			int temp;
//			temp = num[rxn1];
//			num[rxn1] = num[rxn2];
//			num[rxn2] = temp;
//		}
//		// 4. 배열의 요소 중 앞에서 6개 숫자를 로또 당첨 번호로 출력
//		for (int i=1; i<=6; i++) {
//			System.out.println(num[i]+" ");
//		}

	}

}
