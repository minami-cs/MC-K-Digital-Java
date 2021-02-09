
public class ArrayIntExample {

	public static void main(String[] args) {
		int[] nary;  // nary에 힙에 할당한 int 배열의 주소를 담음. 참조 변수
		nary = new int[10];  // int 값 10개를 담을 수 있는 배열을 힙 영역에 할당하여 그 주소를 nary 스택 변수에 담음
//		int[] nary2 = new int[10];  // 배열 선언과 생성 동시에
//		int[] nary3 = new int[] {10, 20, 30, 40, 50};  // 배열의 선언과 초기화를 동시에
//		int[] nary4 = {10, 20, 30, 40, 50};  // =nary3 구조, 배열 선언 시 값 초기화 동시에 할 때는 new int[] 생략가능
		// 아래와 같이 하는 것은 불가능. 배열 선언과 동시에 초기화가 아니면 new int[] 생략 불가
//		int[] nary5;
//		nary5 = {10, 20, 30, 40, 50};
//		nary[0] = 10 // 첫 번째 int에 10 할당
		for (int i=0; i<10; i++) {
			nary[i] = (i+1)*10;
		}
		
		int sum = 0;
		for (int i=0; i<10; i++) {
			sum += nary[i];
		}
		System.out.println(sum);

	}

}
