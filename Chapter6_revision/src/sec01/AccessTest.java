package sec01;

import sec01.access.Access;

public class AccessTest {

	public static void main(String[] args) {
		Access ac = new Access();
		//ac.pv = 10;
		//ac.rv = 10;
		//ac.dv = 10;
		ac.uv = 10;  // public만 가능
	}

}
