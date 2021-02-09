package sec05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//Map<Integer, String> map = Collections.synchronizedMap(hm);  // 수동으로 동기화
		hm.put(100, "hong");
		hm.put(101, "park");
		hm.put(103, "choi");
		
		System.out.println(hm.get(103));
		Set<Integer> kset = hm.keySet();  // keySet(): key를 set객체에 담아서 리턴
		for(int k : kset) {
			System.out.println(k);
		}
		
		Set<Map.Entry<Integer, String>> eset = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> sit = eset.iterator();
		while(sit.hasNext()) {
			Map.Entry<Integer, String> entry = sit.next();
			Integer key = entry.getKey();  // key값 가져오기
			String value = entry.getValue();  // value값 가져오기
			System.out.println(key + ":" + value);
		}
		System.out.println();
		
		// 실제로 많이 쓰이는 것은 key에서 value를 찾아내는 것
		for (String value : hm.values()) {
			System.out.println(value);
		}
	}

}
