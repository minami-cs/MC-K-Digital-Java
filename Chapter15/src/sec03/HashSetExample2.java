package sec03;

import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		HashSet<Member> mems = new HashSet<Member>();
		
		Member mem1 = new Member("hong", 20);
		Member mem2 = new Member("hong", 20);
		Member mem3 = new Member("hong", 30);
		Member mem4 = new Member("park", 20);
		
		mems.add(mem1);
		mems.add(mem2);
		mems.add(mem3);
		mems.add(mem4);
		
		for(Member m : mems) {
			System.out.println(m.name);
		}

	}

}
