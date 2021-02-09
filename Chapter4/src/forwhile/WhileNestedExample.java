package forwhile;

public class WhileNestedExample {

	public static void main(String[] args) {
		int i = 1;
		while (i<=5) {
			int j = 1;
			while (j<=5) {
				System.out.println("i="+i+", j="+j+": nested while");
				j++;
			}
			i++;
		}

	}

}
