class Parent {
	int pnum;
	public Parent() {}
	public Parent(int pnum) {
		this.pnum = pnum;
	}
	public void method() {
		
	}
	public void method1() {
		
	}
}

class Child extends Parent {
	int cnum;
	public Child() {}
	public Child(int pnum, int cnum) {  // 부모 클래스의 pnum도 가져와야 함
		super(pnum);  // 부모 생성성자 호출
		this.cnum=cnum;
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();  // super.를 붙여서 부모 클래스 소속임을 명확히 해주지 않으면 무한재귀로 오버플로우 발생
	}

	public void method2() {
		
	}
}

public class InheritExample2 {

	public static void main(String[] args) {
		Child c = new Child(10, 20);
		c.method();
		
		Parent p1 = new Child(10, 20);
		Parent p2 = new Parent();
		
		System.out.println(p1 instanceof Child);  // true
		System.out.println(p1 instanceof Parent);  // true
		System.out.println(p2 instanceof Child);  // false
		System.out.println(p2 instanceof Parent);  // true

	}

}
