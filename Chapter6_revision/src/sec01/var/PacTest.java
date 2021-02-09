package sec01.var;  // 자바 파일 최상단에는 패키지 이름이 단 한 번만 선언된다

import sec01.var.pac.PacClass;

public class PacTest {

	public static void main(String[] args) {
		// sec01.var.pac.PacClass pc = new sec01.var.pac.PacClass();
		PacClass pc = new PacClass();  // import를 통해 클래스만 사용가능
	}

}
