
public class SwitchExample2 {

	public static void main(String[] args) {
		int score = 49;
		switch(score/10) {  // switch 괄호 안의 변수는 int, char, string만 가능(실수 불가능)
		case 10:  // 10과 9는 같은 결과를 내기 때문에 break 생략 가능
		case 9: System.out.println("A");
		break;
		case 8: System.out.println("B");
		break;
		case 7: System.out.println("C");
		break;
		case 6: System.out.println("D");
		break;
		default: System.out.println("F");
		break;
		}

	}

}
