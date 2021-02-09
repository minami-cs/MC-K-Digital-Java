package sec01.var;

class InitTest {
	int iv = 1;
	static int sv = 10;
	static int[] sarr = new int[10];  // static 블록 내에서 초기화 가능
	//sarr[0] = 1;  // 이렇게 쓰는 것은 명령어이기 때문에 초기화 불가능
	{ // 인스턴스 초기화 블록
		System.out.println(iv);
		iv = 2;
		System.out.println(iv);
	}
	static { // static 초기화 블록
		System.out.println(sv);
		sv = 20;
		System.out.println(sv);
		
		for(int i=0; i<sarr.length; i++) {
			sarr[i] = 10;
		}
	}
	InitTest() {
		iv = 3;
		System.out.println(iv);
	}
}
public class InitBlockTest {

	public static void main(String[] args) {
		InitTest it1 = new InitTest();
		InitTest it2 = new InitTest();
	}

}
