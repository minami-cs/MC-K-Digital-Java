package sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("news.txt");
		FileInputStream fis2 = new FileInputStream("copy.txt");
		FileInputStream fis3 = new FileInputStream("copy2.txt");
		//SequenceInputStream sis = new SequenceInputStream(fis1, fis2);  // 2개 파일
		Vector<FileInputStream> vec = new Vector<FileInputStream>();  // 여기부터 3개 파일
		vec.add(fis1);
		vec.add(fis2);
		vec.add(fis3);
		Enumeration<FileInputStream> e = vec.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		
		FileOutputStream fos = new FileOutputStream("merge.txt");
		byte[] buffer = new byte[1024];
		int len;
		while((len=sis.read(buffer)) != -1) {
			fos.write(buffer,0,len);
		}
		sis.close();
		fos.close();
	}

}
