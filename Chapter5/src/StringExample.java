
public class StringExample {

	public static void main(String[] args) {
		// 스택은 다르지만, 같은 객체
		String str1 = "hong";
		String str2 = "hong";
		if (str1==str2) {  // 두 개가 다른 객체를 참조하는지 참조값을 비교
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		// 위와 같음
		String str3 = new String("hong");
		String str4 = str3;
		if (str3==str4) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		// 서로 다른 객체
//		String str1 = new String("hong");
//		String str2 = new String("hong");
		if (str1==str2) {  // 두 개가 다른 객체를 참조하는지 참조값을 비교
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		if (str1.equals(str2)) {  // 문자열이 같은지 비교
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

	}

}
