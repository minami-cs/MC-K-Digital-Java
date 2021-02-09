

interface DoubleClickable {
	void idclick();
}

class Button {  // 버튼 기능 구현
	Clickable c;
	DoubleClickable dc;
	public void click() {
		System.out.println("클릭");
		if (c!=null) {
			c.iclick();
		}
	}
	public void doubleclick() {
		if (dc!=null) {
			dc.idclick();
		}
	}
	public void addClickListener(Clickable c) {
		this.c=c;
	}
	public void addDClickListener(DoubleClickable dc) {
		this.dc=dc;
	}
	
	interface Clickable {  // static 속성을 가짐
		void iclick();
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		Button libtn = new Button();
		libtn.addClickListener(new Button.Clickable() {
			@Override
			public void iclick() {
				System.out.println("로그인");
				
			};
		});
		libtn.click();
		
		Button joinbtn = new Button();
		joinbtn.addClickListener(new Button.Clickable() {
			@Override
			public void iclick() {
				System.out.println("회원가입");
				
			}
		});
		joinbtn.click();  // 회원가입처리
	}

}
