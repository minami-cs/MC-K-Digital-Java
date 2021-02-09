package sec04.exam01_generic_method;

import sec02.exam02_generic_type.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);  // boxing 앞의 <Integer>는 생략 가능
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}

}
