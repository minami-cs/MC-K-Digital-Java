package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	int num;
	String name;
	int age;
	double height;
	double weight;
	Person() {}
	Person(int num, String name, int age, double height, double weight) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "번호: " + num + ", 이름: " + name + ", 나이: " + age + ", 키: " + height + ", 몸무게: " + weight;
	}
}
public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("person.ser");
			ois = new ObjectInputStream(fis);
			Person p1 = (Person) ois.readObject();  // 다운캐스팅할 때는 classnotfoundexception 예외 발생 가능성 있음
			Person p2 = (Person) ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			System.out.println(e.getMessage());  // 에러메시지는 개발할 때에만 보이게
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());  // 에러메시지는 개발할 때에만 보이게
		} finally {
			try {
				if(ois!=null) ois.close();
			} catch(IOException e) {}
		}
		
		
		
		
//		Person p1 = new Person(100, "한예슬", 40, 172.2, 49.9);
//		Person p2 = new Person(101, "이영애", 43, 169.8, 50.2);
//		
//		FileOutputStream fos = new FileOutputStream("person.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(p1);
//		oos.writeObject(p2);
//		oos.close();
	}

}
