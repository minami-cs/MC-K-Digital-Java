package sec05;

import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<String, Account> accs = new HashMap<String, Account>();
		accs.put("1001", new Account("1001", "정유미", 100000));
		accs.put("1002", new Account("1002", "한지민", 200000));
		accs.put("1003", new Account("1003", "최우식", 300000));
		
		// 특정 계좌 조회
		Account acc1 = accs.get("1003");
		System.out.println(acc1.accInfo());
		System.out.println();
		
		// 전체 계좌 조회
		for(Account acc : accs.values()) {
			System.out.println(acc.accInfo());
		}
		
		System.out.println();
		accs.remove("1003");
		if(accs.containsKey("1003")) {
			System.out.println(accs.get("1003"));
		} else {
			System.out.println("없습니다.");
		}
	}

}
