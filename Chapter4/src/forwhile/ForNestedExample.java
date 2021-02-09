package forwhile;

public class ForNestedExample {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.println("i="+i+", j="+j+": nested for");  // 총 25번
			}
		}

	}

}
