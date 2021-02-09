package forwhile;

public class WhileGugudan {

	public static void main(String[] args) {
		int i = 1;
		while (i<=9) {
			int j = 2;
			while (j<=9) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
