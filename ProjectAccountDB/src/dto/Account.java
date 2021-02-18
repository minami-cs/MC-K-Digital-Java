package dto;

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
			return false;
		}
		balance += money;
		return true;
	}
	public boolean withdrawal(int money) {
		if (balance < money) {
			return false;
		}
		balance -= money;
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
