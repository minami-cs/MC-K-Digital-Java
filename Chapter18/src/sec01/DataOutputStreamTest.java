package sec01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		char ch = 'A';
		int n = 100;
		double p = 2.14;
		String str = "String";
		try {  // FileOutputStream은 try catch 함수를 써야 함. 없으면 에러.
			fos = new FileOutputStream("data.bin");
			dos = new DataOutputStream(fos);
			dos.writeChar(ch);
			dos.writeInt(n);
			dos.writeDouble(p);
			dos.writeUTF(str);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(dos!=null) dos.close();
			} catch(IOException e) {}
		}
	}

}
