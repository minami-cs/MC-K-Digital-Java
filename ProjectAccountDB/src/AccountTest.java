import java.util.List;

import dao.AccountDAO;
import dto.Account;
import dto.SpecialAccount;

public class AccountTest {
	public static void insertAccount() {
		AccountDAO dao = new AccountDAO();
		dao.insertAccount(new Account("1003","이서진",100000));
		dao.insertAccount(new SpecialAccount("1004","최우식",20000,"Gold"));
		dao.connectionClose();
	}
	public static void queryAccount() {
		AccountDAO dao = new AccountDAO();
		Account acc = dao.queryAccount("1001");
		dao.connectionClose();
		System.out.println(acc.accInfo());
	}
	public static void depositAccount() {
		AccountDAO dao = new AccountDAO();
		dao.depositAccount("1001", 2000);
		dao.connectionClose();
		System.out.println("입금완료");
	}
	public static void withdrawAccount() {
		AccountDAO dao = new AccountDAO();
		dao.withdrawAccount("1001", 10000);
		dao.connectionClose();
		System.out.println("출금완료");
	}
	public static void queryAllAccounts() {
		AccountDAO dao = new AccountDAO();
		List<Account> list = dao.queryAllAccounts();
		for(Account acc : list) {
			System.out.println(acc.accInfo());
		}
		dao.connectionClose();
	}
	public static void queryAccounts() {
		AccountDAO dao = new AccountDAO();
		List<Account> list = dao.queryAccounts();
		for(Account acc : list) {
			System.out.println(acc.accInfo());
		}
		dao.connectionClose();
	}
	public static void querySpecialAccounts() {
		AccountDAO dao = new AccountDAO();
		List<SpecialAccount> list = dao.querySpecialAccounts();
		for(Account acc : list) {
			System.out.println(acc.accInfo());
		}
		dao.connectionClose();
	}
	public static void transferAccount() {
		AccountDAO dao = new AccountDAO();
		dao.transferAccount("1003", "1004", 40000);
		dao.connectionClose();
	}
	public static void main(String[] args) {
		//insertAccount();
		//queryAccount();
		//depositAccount();
		//withdrawAccount();
		//queryAllAccounts();
		//queryAccounts();
		//querySpecialAccounts();
		transferAccount();
	}

}
