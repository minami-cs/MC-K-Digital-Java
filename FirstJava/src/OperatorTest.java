
public class OperatorTest {

	public static void main(String[] args) {
		// 증감부호 앞에 했을 때
		int n = 10;
		System.out.println(n);
		++n;
		System.out.println(n);
		
		// 증감부호 뒤에 했을 때
		int n2 = 10;
		System.out.println(n2);
		n2++;
		System.out.println(n2);
		
		// 증감부호 위치에 따른 값 차이
		int r, n3 = 10;
		r = ++n3;
		System.out.println(r);  // 11
		System.out.println(n3);  // 11
		
		int r2, n4 = 10;
		r2 = n4++;
		System.out.println(r2);  // 10
		System.out.println(n4);  // 11
		
		boolean b = false;
		System.out.println(!b);
		
		int v1 = 10, v2 = 20;
		boolean b2 = v1 > v2;
		System.out.println(!(v1 < v2));
		byte bt = 10;  // 00001010
		System.out.println(~bt);  // 11110101 : 음수의 2의 보수(00001011은 -11)
		
		char ch = 'k'; // k뒤에는 null값이 있음 최대 2byte
		String str = "kkk";  // 2byte보다 긴 문자열은 string으로
		String hello = "Hello";
		int year = 2021;
		String greeting = hello + ", " + year;
		System.out.println(greeting);
		
		String str2 = 7 + 7 + "7";
		System.out.println(str2);  // 147 - 처음 7+7은 숫자 연산식
		
		String str3 = "7" + 7 + 7;
		System.out.println(str3);  // 777 - 처음 "7"이 문자라서 문자로 표현
		
		byte b3 = 10, b4 = 2;
		System.out.println(b3&b4);  // b3: 00001010, b4: 00000010, b3&b4: 00000010
		System.out.println(b3|b4);  // b3: 00001010, b4: 00000010, b3|b4: 00001010
		System.out.println(b3^b4);
		
		byte b5 = 10;
		System.out.println(b5 >> 1);  // b5: 00001010: 10, 00000101: 5
		byte b6 = -11;
		System.out.println(b6 >> 1);  // b6: 11110101: -11, 11111010: -6 (음수이므로 맨 앞자리가 0이 되면 1로 채워준다)
		System.out.println(b6 >>> 1);  // 01111010: 2147483642
		byte b7 = 10;
		System.out.println(b7 << 1);  // b7: 00001010: 10, 00010100: 20
		
		int a1 = 10, b1 = 20;
//		a1 += b1;  // a1 = a1 + b1: 30
//		a1 += b1 * 3;  // a1 = a1 + b1 * 3: 70
//		System.out.println(a1);
		
		a1 *= b1 + 3;  // b1+3에 우선순위가 있음. 230
		System.out.println(a1);
		
		// a = a + 5; 와 a += 5는 같다
		
		// 삼항조건연산자: 조건식? 식:식2;
		int score = 95;
		char grade;
		grade = (score > 70)? 'P':'F';
		System.out.println(grade);
		// 아래 if문과 똑같이 사용 가능하지만 연산자가 속도가 더 빠름
		if (score>70) {
			grade = 'P';
		} else {
			grade = 'F';
		}

	}

}
