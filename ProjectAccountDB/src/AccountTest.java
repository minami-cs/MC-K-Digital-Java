import dao.AccountDAO;
import dto.Account;
import dto.SpecialAccount;

public class AccountTest {
	public static void insertAccount() {
		AccountDAO dao = new AccountDAO();
		dao.insertAccount(new Account("1001","정유미",100000));
		dao.insertAccount(new SpecialAccount("1002","이주영",20000,"VIP"));
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
	}
	public static void main(String[] args) {
		//insertAccount();
		//queryAccount();
		depositAccount();
	}

}
