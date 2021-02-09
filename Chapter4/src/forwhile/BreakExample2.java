package forwhile;

public class BreakExample2 {

	public static void main(String[] args) {
		// 이중반복문에서의 break 예제
//		for (int i=0; i<10; i++) {
//			for (int j=0; j<10; j++) {
//				System.out.println("i: " + i + ", j: " + j);
//				if (j==5) break;  // j 반복문에만 적용
//			}
//		}
		
		Outter: for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.println("i: " + i + ", j: " + j);
				if (j==3) break Outter;  // Outer label이 붙어있는 반복문만 빠져나온다
			}
		}

	}

}
