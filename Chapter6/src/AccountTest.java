
class Account {
	String account;
	String name;
	int balance;
	public Account() {  // 기본 생성자 값
		account = "100";
		name = "n/a";
		balance = 0;
	}
	
	public Account(String account, String name, int balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(String account, int balance) {
		this.account = account;
		name = "n/a";
		this.balance = balance;
	}
	
	public void deposit(int money) {
		if (money>0) {
			balance += money;
		}
	}
	
	public void withdrawal(int money) {
		if (balance>=money) {
			balance -= money;
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}
	public String info() {
		return "계좌번호: " + account + ", 이름: " + name + ", 잔액: " + balance;
	}
}

public class AccountTest {
	public static void main(String[] args) {
		// Account 객체 2개 만들기
		Account acc1 = new Account();
		Account acc2 = new Account();
		// 101, 홍길동, 100000
		acc1.account = "101";
		acc1.name = "홍길동";
		acc1.balance = 100000;
		// 102, 김길동, 200000
		acc2.account = "102";
		acc2.name = "김길동";
		acc2.balance = 200000;
		// 두 계좌 정보 출력
		System.out.println(acc1.info());
		System.out.println(acc2.info());
		
		acc1.deposit(10000);
		acc2.withdrawal(20000);
		
		System.out.println(acc1.info());
		System.out.println(acc2.info());
		
		Account acc0 = new Account();
		System.out.println(acc0.info());
		
		Account acc3 = new Account("104", "차길동", 1000000);
		Account acc4 = new Account("105", 2000000);
		System.out.println(acc3.info());
		System.out.println(acc4.info());
	}
}
