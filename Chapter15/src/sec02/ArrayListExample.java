package sec02;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();  // 2. generic을 사용한다. <String> 제네릭을 사용하면 배열의 타입도 String으로.
		list.add("hong");
		list.add("gil");
		list.add("dong");
		//String str = list.get(0);  // 1. 매번 casting을 해줘야 해서
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		//System.out.println(str);
		
		// 향상된 for문 사용에 최적화되어 있음
		for( String name : list ) {
			System.out.println(name);
		}
		
		list.remove(0);
		System.out.println();
		for(String name : list) {
			System.out.println(name);
		}
		
		list.remove("dong");
		System.out.println();
		for(String name : list) {
			System.out.println(name);
		}
	}

}
