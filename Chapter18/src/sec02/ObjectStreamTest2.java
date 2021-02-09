package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<Person> list;
		try {
			fis = new FileInputStream("person2.ser");
			ois = new ObjectInputStream(fis);
			list = (ArrayList<Person>) (ois.readObject());
			
			for(Person p : list) {
				System.out.println(p);
			}
		} catch(IOException e) {}
		catch(ClassNotFoundException e) {}
		finally {
			try {
				ois.close();
			} catch(IOException e) {}
		}
//		List<Person> al = new ArrayList<>();
//		//ArrayList al = new ArrayList(); - 컴파일 한 후
//		//al.add(new Person());
//		//Person p = al.get(0);
//		//al.add(new Person()); - 컴파일 한 후
//		//Person var = (Person)(al.get(0)); - 컴파일 한 후
//		al.add(new Person(100, "한예슬", 40, 172.2, 49.9));
//		al.add(new Person(101, "이영애", 43, 169.8, 50.2));
//		
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		try {
//			fos = new FileOutputStream("person2.ser");
//			oos = new ObjectOutputStream(fos);
//		} catch(IOException e) {}
//		finally {
//			try {
//				oos.close();
//			} catch(IOException e) {}
//		}
		
	}

}
