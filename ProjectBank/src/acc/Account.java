package acc;

import java.io.Serializable;

public class Account implements Serializable {
	private String id;
	private String owner;
	private int balance;
	
	public Account() {}
	public Account(String id, String owner, int balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	public boolean deposit(int money) {
		if (money <= 0) {
			System.out.println("결과: 올바른 금액을 입력해주세요.");
			return false;
		}
		balance += money;
		System.out.println("결과: 예금을 완료하였습니다.");
		return true;
	}
	public boolean withdrawal(int money) {
		if (balance < money) {
			System.out.println("결과: 올바른 금액을 입력해주세요.");
			return false;
		}
		balance -= money;
		System.out.println("결과: 출금을 완료하였습니다.");
		return true;
	}
	public String accInfo() {
		return "계좌번호: " + id + ", 이름: " + owner + ", 잔액: " + balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
