import java.util.ArrayList;
import java.util.Scanner;

import Exp.AccountException;
import Exp.BankExpCode;
import acc.Account;
import acc.SpecialAccount;
import dao.AccountDAO;

public class Bank {
	Scanner sc = new Scanner(System.in);

	public void createAccount() throws AccountException {
		System.out.println("---------");
		System.out.println("일반계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("이름: ");
		String owner = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		
		AccountDAO dao = new AccountDAO();
		Account acc = dao.queryAccount(id);
		
		if(acc!=null) {  // 중복계좌 체크
			throw new AccountException(BankExpCode.EXIST_ACC);
		}
		dao.insertAccount(new Account(id, owner, balance));
		dao.connectionClose();
		System.out.println("결과: 일반계좌가 개설되었습니다.");
	}
	public void createSpecialAccount() throws AccountException {
		System.out.println("---------");
		System.out.println("특수계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("이름: ");
		String owner = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		System.out.println("등급\nVIP: 1, Gold: 2, Silver: 3, Normal: 4\n선택: ");
		int ngrade = Integer.parseInt(sc.nextLine());
		String grade = "Normal";
		switch(ngrade) {
		case 1: grade = "VIP"; break;
		case 2: grade = "Gold"; break;
		case 3: grade = "Silver"; break;
		case 4: grade = "Normal"; break;
		}
		AccountDAO dao = new AccountDAO();
		Account acc = dao.queryAccount(id);
		if(acc!=null) {
			throw new AccountException(BankExpCode.EXIST_ACC);
		}
		dao.insertAccount(new SpecialAccount(id, owner, balance, grade));
		dao.connectionClose();
		System.out.println("결과: 특수계좌가 개설되었습니다.");
	}
	public void viewAccount() throws AccountException {
		System.out.println("------");
		System.out.println("계좌조회");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		AccountDAO dao = new AccountDAO();
		Account acc = dao.queryAccount(id);
		if (acc==null) {
			throw new AccountException(BankExpCode.NOT_ACC);
		}
		System.out.println("------------");
		System.out.println("계좌 조회 결과");
		System.out.println("------------");
		System.out.println(acc.accInfo());
	}
	public void accList() throws AccountException {

		System.out.println("-----------------------------");
		System.out.println("1. 일반계좌 | 2. 특수계좌 | 3. 전체");
		System.out.println("-----------------------------");
		System.out.print("선택> ");
		int sel = Integer.parseInt(sc.nextLine());  // specialaccount가 아닌지 물어봐야 함
		AccountDAO dao = new AccountDAO();
		if(sel==1) {
			ArrayList<Account> list1 = dao.queryAccounts();
			for(Account acc : list1) {
				System.out.println(acc.accInfo());
			}
		} else if(sel==2) {
			ArrayList<SpecialAccount> list2 = dao.querySpecialAccounts();
			for(Account acc : list2) {
				System.out.println(acc.accInfo());
			}
		} else if(sel==3) {
			ArrayList<Account> list3 = dao.queryAllAccounts();
			for(Account acc : list3) {
				System.out.println(acc.accInfo());
			}
		} else {
			throw new AccountException(BankExpCode.SUB_ACCMENU);
		}
		dao.connectionClose();
	}
	public void deposit() throws AccountException {
		System.out.println("---");
		System.out.println("입금");
		System.out.println("---");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(sc.nextLine());
		AccountDAO dao = new AccountDAO();
		dao.depositAccount(id, money);
		dao.connectionClose();
	}
	public void withdrawal() throws AccountException {
		System.out.println("---");
		System.out.println("출금");
		System.out.println("---");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("출금금액: ");
		int money = Integer.parseInt(sc.nextLine());
		AccountDAO dao = new AccountDAO();
		dao.withdrawAccount(id, money);
		dao.connectionClose();
	}
	public int menu() throws AccountException {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 계좌조회 | 3. 계좌목록 | 4. 예금 | 5. 출금 | 0. 종료");
		System.out.println("-----------------------------------------------------------");
		System.out.print("선택> ");
		int sel = Integer.parseInt(sc.nextLine());
		if (sel >= 0 && sel <= 5) return sel;
		throw new AccountException(BankExpCode.MAIN_MENU);
	}
	public void accMenu() throws AccountException {
		System.out.println("----------------------");
		System.out.println("1. 일반계좌 | 2. 특수계좌");
		System.out.println("----------------------");
		System.out.print("선택> ");
		int sel = Integer.parseInt(sc.nextLine());
		if (sel==1) {
			createAccount();
		} else if (sel==2) {
			createSpecialAccount();
		} else {
			throw new AccountException(BankExpCode.ACC_MENU);
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();  // 자기 자신을 포함시킨 객체 생성 가능
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0) {
					break;
				}
				switch(sel) {
				case 1: bank.accMenu(); break;
				case 2: bank.viewAccount(); break;
				case 3: bank.accList(); break;
				case 4: bank.deposit(); break;
				case 5: bank.withdrawal(); break;
					}
				} catch (NumberFormatException e) {
					System.out.println("숫자만 입력이 가능합니다.");
				} catch (AccountException e) {
					System.out.println(e.getMessage());
				}
		}

	}

}
