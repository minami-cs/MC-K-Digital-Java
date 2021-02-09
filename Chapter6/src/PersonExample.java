
public class PersonExample {
	
	public static void main(String[] args) {
		Person p = new Person();  // Person은 데이터타입(=자료형), p는 heap영역을 가리키는 주소
		p.age = 20;
		p.name = "정민아";
		System.out.println(p.info());
		
		Person p2 = new Person();  // Person()은 생성자, 생성자는 클래스명과 동일하고 함수의 리턴을 붙이지 않음
		p2.age = 30;
		p2.name = "신수현";
		System.out.println(p2.info());
		
		Person p3 = new Person("바보양", 43);  // Person 클래스 안에 name과 age 넣을 수 있게 되어 있어서 코드 길이가 줄어듦
		System.out.println(p3.info());
		
		Person p4 = new Person();
		System.out.println(p4.info());
		
		Person p5 = new Person("여훈민");
		System.out.println(p5.info());
		
		Person p6 = new Person(32);
		System.out.println(p6.info());
	}

}
