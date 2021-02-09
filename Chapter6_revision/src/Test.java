
public class Test {

	public static void main(String[] args) {
		int x = 0, sum = 0;
		
		for(;x++<10;) {  // x가 11일 때 10이 되므로 for문을 나옴 
			sum += x;
		}
		System.out.println(x);
		System.out.println(sum);
	}

}
