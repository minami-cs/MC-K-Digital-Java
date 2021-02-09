package sec01;

import sec01.access.Access;

public class ChildAccess extends Access {

	public void method() {
		//pv = 10;  // 부모가 private 변수라서 자식도 접근 불가
		//dv = 20;  // dafault 변수는 패키지가 다르면 접근 불가
		rv = 30;  // protected 변수는 패키지가 같으면 사용 가능
		uv = 40;  // public은 변수는 패키지가 달라도 사용 가능
	}
}
