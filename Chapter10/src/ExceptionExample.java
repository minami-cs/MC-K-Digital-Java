
public class ExceptionExample {

	public static void main(String[] args) {
		String str = "dudu-dudu-du";
		int a = 10, b = 0;
		try {
			System.out.println(str.toString());
			System.out.println(a/b);
		} catch(NullPointerException e) {  // 프로그램이 정상작동하지 않을 때 발생하는 오류와 맞는 걸 넣어줘야 예외처리가 제대로 된다. catch문은 위에서 아래로 순서대로 처리되므로 순서에 유의해야 한다
			//System.out.println(e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {  // 각 예외 경우 마다 그에 맞는 처리문을 넣어줘야 한다
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료");

	}

}
