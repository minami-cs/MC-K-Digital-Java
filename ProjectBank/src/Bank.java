import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import Exp.AccountException;
import Exp.BankExpCode;
import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Account> accs = new HashMap<>();
//	Account[] accs = new Account[100];
//	int accCnt;
	
//	public int getAccCnt() {
//		return accCnt;
//	}
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
		
//		try {
//			searchAccById(id);
//			throw new AccountException(BankExpCode.EXIST_ACC);
//		} catch (AccountException e) {
//			if (e.getErrCode()==BankExpCode.EXIST_ACC)
//				throw e;
//			accs[accCnt++] = new Account(id, owner, balance);
//			System.out.println("결과: 계좌가 개설되었습니다.");
//		}
		
		if(accs.containsKey(id)) {  // 중복계좌 체크
			throw new AccountException(BankExpCode.EXIST_ACC);
		}
		accs.put(id, new Account(id, owner, balance));
		System.out.println("결과: 계좌가 개설되었습니다.");
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
//		try {
//			searchAccById(id);
//			throw new AccountException(BankExpCode.EXIST_ACC);
//		} catch (AccountException e) {
//			if (e.getErrCode()==BankExpCode.EXIST_ACC)
//				throw e;
//			accs[accCnt++] = new SpecialAccount(id,owner,balance,grade);
//			System.out.println("결과: 특수계좌가 개설되었습니다.");
//		}
		
		if(accs.containsKey(id)) {
			throw new AccountException(BankExpCode.EXIST_ACC);
		}
		accs.put(id, new SpecialAccount(id, owner, balance, grade));
		System.out.println("결과: 특수계좌가 개설되었습니다.");
	}
	public void viewAccount() throws AccountException {
		System.out.println("------");
		System.out.println("계좌조회");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
//		Account acc = searchAccById(id);
		Account acc = accs.get(id);
		if (!accs.containsKey(id)) {
			throw new AccountException(BankExpCode.NOT_ACC);
		}
		System.out.println(acc.accInfo());
	}
	public void accList() throws AccountException {

		System.out.println("-----------------------------");
		System.out.println("1. 일반계좌 | 2. 특수계좌 | 3. 전체");
		System.out.println("-----------------------------");
		System.out.print("선택> ");
		int sel = Integer.parseInt(sc.nextLine());  // specialaccount가 아닌지 물어봐야 함
//		if (sel==1) {
//			for (int i=0; i<accCnt; i++) {
//				if (accs[i] instanceof SpecialAccount == false) {
//					System.out.println(accs[i].accInfo());
//				}
//			}
//		} else if (sel==2) {
//			for (int i=0; i<accCnt; i++) {
//				if (accs[i] instanceof SpecialAccount) {
//					System.out.println(accs[i].accInfo());
//				}
//			}
//		} else if (sel==3) {
//			for (int i=0; i<accCnt; i++) {
//				System.out.println(accs[i].accInfo());
//			}
//		} else {
//			throw new AccountException(BankExpCode.SUB_ACCMENU);
//		}

		if(sel==1) {
			for(Account acc : accs.values()) {
				if (acc instanceof SpecialAccount == false) {
					System.out.println(acc.accInfo());
				}
			}
		} else if(sel==2) {
			for(Account acc : accs.values()) {
				if (acc instanceof SpecialAccount == true) {
					System.out.println(acc.accInfo());
				}
			}
		} else if(sel==3) {
//			for(Account acc : accs.values()) {
//				System.out.println(acc.accInfo());
//			}
			Iterator<Account> its = accs.values().iterator();
			while(its.hasNext()) {
				System.out.println(its.next().accInfo());
			}
		} else {
			throw new AccountException(BankExpCode.SUB_ACCMENU);
		}

//		System.out.println("------");
//		System.out.println("계좌목록");
//		System.out.println("------");
//		for (int i=0; i<accCnt; i++) {
//			System.out.println(accs[i].accInfo());
//		}
	}
//	private Account searchAccById(String id) throws AccountException {
//		for (int i=0; i<accCnt; i++) {
//			if (accs[i].getId().equals(id)) {
//				return accs[i];
//			}
//		}
//		throw new AccountException(BankExpCode.NOT_ACC);  // if 외 다른 모든 경우
//	}
	public void deposit() throws AccountException {
		System.out.println("---");
		System.out.println("입금");
		System.out.println("---");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(sc.nextLine());
		//Account acc = searchAccById(id);
		Account acc = accs.get(id);
		if (!accs.containsKey(id)) {  // 계좌번호가 틀리면
			throw new AccountException(BankExpCode.NOT_ACC);
		}
		acc.deposit(money);
//		boolean flag = acc.deposit(money);
//		if (flag)
//			System.out.println("결과: 예금을 완료하였습니다.");
//		else
//			System.out.println("결과: 올바른 금액을 입력해주세요.");
	}
	public void withdrawal() throws AccountException {
		System.out.println("---");
		System.out.println("출금");
		System.out.println("---");
		System.out.print("계좌번호: ");
		String id = sc.nextLine();
		System.out.print("출금금액: ");
		int money = Integer.parseInt(sc.nextLine());
		//Account acc = searchAccById(id);
		Account acc = accs.get(id);
		if (!accs.containsKey(id)) {
			throw new AccountException(BankExpCode.NOT_ACC);
		}
		accs.get(id).withdrawal(money);
//		boolean flag = acc.withdrawal(money);
//		if (flag)
//			System.out.println("결과: 출금을 완료하였습니다.");
//		else
//			System.out.println("결과: 잔액이 부족합니다.");
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
	
	public void writeAccs() {
		// 계좌 수
		// 각 계좌 (특수계좌여부, 계좌번호, 이름, 잔액, (등급))
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("accs.dat");
			dos = new DataOutputStream(fos);
			dos.writeInt(accs.size());  // 계좌수
			for(Account acc : accs.values()) {
				if(acc instanceof SpecialAccount) {
					dos.writeChar('S');  // 특수계좌 구분값
					dos.writeUTF(((SpecialAccount) acc).getGrade());  // SpecialAccount로 다운캐스팅 - acc에는 등급이 없으므로
				} else {
					dos.writeChar('N');  // 일반계좌 구분값
				}
				dos.writeUTF(acc.getId());  // 계좌번호
				dos.writeUTF(acc.getOwner());  // 이름
				dos.writeInt(acc.getBalance());  // 잔액
			}
		} catch(IOException e) {
		} finally {
			try {
				if(dos != null) dos.close();
			} catch(IOException e) {}
		}
	}
	public void readAccs() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		int cnt;
		char sect;
		String id, owner, grade=null;
		int balance;
		Account acc;
		try {
			fis = new FileInputStream("accs.dat");
			dis = new DataInputStream(fis);
			cnt = dis.readInt();  // 계좌수
			for(int i=0; i<cnt; i++) {
				sect = dis.readChar();  // 계좌구분(특수/일반)
				if(sect == 'S') grade = dis.readUTF();  // 등급
				id = dis.readUTF();  // 계좌번호
				owner = dis.readUTF();  // 이름
				balance = dis.readInt();  // 잔액
				if(sect == 'S') {
					acc = new SpecialAccount(id, owner, balance, grade);
				} else {
					acc = new Account(id, owner, balance);
				}
				accs.put(id, acc);
			}
		} catch(IOException e) {
		} finally {
			try {
				if(dis != null) dis.close();
			} catch(IOException e) {}
		}
	}
	public void writeAccs_t() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		String info="";
		try {
			fw = new FileWriter("accs.txt");
			bw = new BufferedWriter(fw);
			for(Account acc : accs.values()) {
				info="";
				info += acc.getId();
				info += "#" + acc.getOwner();
				info += "#" + acc.getBalance();
				if(acc instanceof SpecialAccount) {
					info += "#" + ((SpecialAccount) acc).getGrade();
				}
				bw.write(info);
				bw.newLine();
			}
		} catch(IOException e) {
		} finally {
			try {
				if(bw!=null) bw.close();
			} catch(IOException e) {}
		}
	}
	public void readAccs_t() {
		FileReader fr = null;
		BufferedReader br = null;
		String info, id, owner, grade = null;
		int balance;
		String[] arry;
		Account acc;
		try {
			fr = new FileReader("accs.txt");
			br = new BufferedReader(fr);
			// 1. 반복문으로 라인 읽기
			while((info=br.readLine())!=null) {
				// 2. 읽은 라인을 구분자로 분리
				arry = info.split("#");
				// 3. 분리한 각 문자열을 기본 데이터 타입 변수에 담기
				id = arry[0];
				owner = arry[1];
				balance = Integer.parseInt(arry[2]);
				// 4. 분리한 문자열 갯수가 4개이면 등급도 변수에 담기
				// 5. 등급 여부에 따라 Account 또는 SpecialAccount 객체 만들어서 accs에 저장하기
				if(arry.length == 4) {
					grade = arry[3];
					acc = new SpecialAccount(id, owner, balance, grade);
				} else {
					acc = new Account(id, owner, balance);
				}
				accs.put(id, acc);
			}
		} catch(IOException e) {
		} finally {
			try {
				if(br!=null) br.close();
			} catch(IOException e) {}
		}
	}
	public void writeAccs_s() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("accs.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(accs);
		} catch(IOException e) {}
		finally {
			try {
				if(oos!=null) oos.close();
			} catch(IOException e) {}
		}
	}
	public void readAccs_s(){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("accs.ser");
			ois = new ObjectInputStream(fis);
			accs = (HashMap<String, Account>) ois.readObject();
		} catch(IOException e) {}
		catch(ClassNotFoundException e) {}
		finally {
			try {
				if(ois!=null) ois.close();
			} catch(IOException e) {}
		}
	}
	public static void main(String[] args) {
		Bank bank = new Bank();  // 자기 자신을 포함시킨 객체 생성 가능
		//bank.readAccs();
		bank.readAccs_s();
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0) {
					//bank.writeAccs();
					bank.writeAccs_s();
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
//		int[] arr = new int[10];
//		for (int i=0; i<10; i++) {
//			arr[i] = i+1;
//		}
//		for (int i=0; i<10; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		Account[] accs = new Account[100];  // 레퍼런스만 100개 생성된 것, 객체 100개 생성된 것이 아님
//		accs[0] = new Account();
//		
//		int[][] arrs = new int[2][3];
//		// arrs[0]: new int[3]
//		// arrs[1]: new int[3]
//		System.out.println(arrs.length);  // length는 2
//		System.out.println(arrs[0].length);  // length는 3
//		System.out.println(arrs[1].length);  // length는 3
//		
//		arrs[0][0] = 10;
//		arrs[1][2] = 100;
//		
//		int[] arr;
//		arr = new int[10];
//		
//		// 가변 배열
//		int[][] arrs2 = new int[2][];
//		arrs2[0] = new int[2];
//		arrs2[1] = new int[3];

	}

}
