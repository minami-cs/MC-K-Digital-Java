package forwhile;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		int keyCode = 0;
		boolean run = true;
		int speed = 0;
		
		while (run) {
			if (keyCode != 13 && keyCode != 10) {  // enter키값을 무시하기 위한 조건
				System.out.println("------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("------------------------");
				System.out.println("선택>>");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) {
				speed++;
				System.out.println("현재 속도:" + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도:" + speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("종료됨");

	}

}
