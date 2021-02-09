
public class InnerClassTest {

	public static void main(String[] args) {
		int n = 10;  // local 클래스에서 가져다 사용 가능하며 final 변수이다. final 명기해주지 않아도 자동으로 final로 지정됨.
		class Local {
			public void method() {
				int m = 0;
				System.out.println(n);  // 그래서 n은 final 변수이기 때문에 n++같이 값 변경은 불가
				System.out.println(m++);  // m은 같은 지역 클래스 내에 선언된 것이므로 얼마든지 변경 가능
			}
		}
		Local lc = new Local();
		lc.method();
	}

}
