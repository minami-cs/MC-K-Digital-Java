
public class CopyArrayExample {

	public static void main(String[] args) {
		int[] arry = new int[] {10, 20, 30};
		int[] copy = new int[3];
		int[] rpy = arry;  // ref 변수 복사 = 얕은 복사
//		copy = arry;  // copy는 arry의 참조값을 갖게 됨, ref 변수 복사 = 얕은 복사
		System.arraycopy(arry, 0, copy, 0, arry.length);  // 메모리를 분리하여 복사 = 깊은 복사
		arry[0] = 40;
		System.out.println("원본 데이터");
		for (int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
		System.out.println("\n깊은 복사");
		for (int i=0; i<copy.length; i++) {
			System.out.println(copy[i]);
		}
		System.out.println("\n얕은 복사");
		for (int i=0; i<rpy.length; i++) {
			System.out.println(rpy[i]);
		}
		

	}

}
