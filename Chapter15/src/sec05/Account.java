package sec05;

public class Account {
	String id;
	String owner;
	int balance;
	
	public Account() {}
	public Account(String id, String owner, int money) {
		this.id=id;
		this.owner = owner;
		this.balance=money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return owner;
	}
	public void setName(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean deposit(int money)  {
		if(money<=0) 
			return false;
		balance+=money;
		return true;
	}
	
	public boolean withdrawal(int money) {
		if(balance<money) 
			return false;

		balance-=money;
		return true;
	}	
	public String accInfo() {
		return "계좌번호: "+id+", 이름: "+ owner +", 잔액: "+balance;
	}
}
