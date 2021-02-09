package practice10;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {  // to do
		if(!id.equals("blue")) {
			// to do, id가 blue가 아니면 NotExistIDException 발생
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			// to do, password가 12345가 아니면 WrongPasswordException 발생
			throw new WrongPasswordException("패스워드가 틀립니다.");
		
		}
	}

}