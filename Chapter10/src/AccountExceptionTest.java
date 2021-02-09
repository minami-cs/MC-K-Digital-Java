enum BankExpCode {NOT_ACC, EXIST_ACC, LACK_BLNC, NOT_DEPOSIT, MAIN_MENU, ACC_MENU};
class AccountException extends Exception {
	// 계좌번호가 틀린 경우
	// 계좌번호 중복 생성되는 경우
	// 잔액이 부족한 경우
	// 입금액이 잘못된 경우
	// 메뉴: 0-5까지만 선택 가능
	// 서브메뉴: 1,2만 선택 가능
	BankExpCode errCode;
	public AccountException() {
		super("계좌 오류");
	}
	public AccountException(String message) {
		super(message);
	}
	public AccountException(String message, BankExpCode errCode) {
		super(message);
		this.errCode = errCode;
	}
	public AccountException(BankExpCode errCode) {
		super("계좌 오류");
		this.errCode = errCode;
	}
	@Override
	public String getMessage() {
		String msg = super.getMessage();
		switch(errCode) {
		case NOT_ACC: msg += ": 계좌번호가 틀립니다."; break;
		case EXIST_ACC: msg += ": 이미 존재하는 계좌번호입니다."; break;
		case LACK_BLNC: msg += ": 계좌의 잔액이 부족합니다."; break;
		case NOT_DEPOSIT: msg += ": 입금액이 잘못되었습니다."; break;
		case MAIN_MENU: msg += ": 0 - 5만 선택 가능합니다."; break;
		case ACC_MENU: msg += ": 1, 2만 선택 가능합니다."; break;
		}
		return msg;
	}
	
}
public class AccountExceptionTest {
	public static void errNotAcc() throws AccountException {
		throw new AccountException(BankExpCode.NOT_ACC);
	}
	public static void errExistAcc() throws AccountException {
		throw new AccountException(BankExpCode.EXIST_ACC);
	}
	public static void main(String[] args) {
		try {
			//errNotAcc();
			errExistAcc();
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}

	}

}
