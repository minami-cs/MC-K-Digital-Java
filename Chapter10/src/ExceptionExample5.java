
public class ExceptionExample5 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
			System.out.println("try");
			return;
		} catch (Exception e) {
			System.out.println("예외 처리");
			return;
		} finally {  // 예외 발생할 때나 발생하지 않을 때나 반드시 처리. try or catch문의 return 적용 안 받음
			System.out.println("마무리 처리");
		}
		//System.out.println("마무리 처리");
		//System.out.println("프로그램 종료");

	}

}
