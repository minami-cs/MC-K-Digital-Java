package sec04;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();  // Integer는 int(기본변수)를 클래스화 시켜주는(boxing) 레퍼런스 클래스
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(20);
		
		// 정렬되어서 순서대로 출력해줌
		for(int n : ts) {
			System.out.println(n);
		}

	}

}
