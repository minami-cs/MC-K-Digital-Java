
public class VarandType {

	public static void main(String[] args) {
		// 강제 타입 변환(명시적)
		int i = 10;
		byte b = (byte)i;
				
		// 자동 타입 변환(암시적, 묵시적)
		int n = b;
		
		// 연산식은 같은 타입끼리만 가능
		int nval = 10;
		double dval = 15.5;
		double res = nval+dval;  // 보통 int+double은 double로
		int nres1 = nval+(int)dval;  // int로 사용하고 싶다면1
		int nres2 = (int)(nval+dval);  // int로 사용하고 싶다면2
		
		int k = 70, e = 85, m = 98;
		double avg = (k+e+m)/3.0;  // k,e,m이 정수라서 소숫점이 나오게 하려면 3.0으로
		System.out.println(avg);

	}

}
