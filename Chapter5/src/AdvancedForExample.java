
public class AdvancedForExample {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int data : arr) {  // 향상된 for문(속도가 빠름) = for i in arr (Python)
			sum += data;
		}
		System.out.println(sum);

	}

}
