package dto;

import java.io.Serializable;

/* SpecialAccount
 * grade: VIP, Gold, Silver, Normal
 * 설명: 등급별 입금시 입금액을 추가 (VIP: 0.04, Gold: 0.03, Silver: 0.02, Normal: 0.01) */
public class SpecialAccount extends Account implements Serializable {

	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public SpecialAccount() {}
	public SpecialAccount(String id, String owner, int balance, String grade) {
		super(id, owner, balance);
		this.grade = grade;
	}

	@Override
	public boolean deposit(int money) {
		double rate = 0;
		switch(grade) {
		case "VIP": rate = 0.04; break;
		case "Gold": rate = 0.03; break;
		case "Silver": rate = 0.02; break;
		case "Normal": rate = 0.01; break;
		}
		return super.deposit(money+(int)(money*rate));
	}

	@Override
	public String accInfo() {
		return super.accInfo() + ", 등급: " + grade;
	}
	
	

}
