package sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("news.txt");
		FileOutputStream fos = new FileOutputStream("copy.txt");  // 폴더 전체의 파일을 읽어오려면 경로를 넣어주면 된다.
		BufferedInputStream bis = new BufferedInputStream(fis);  // 보조 스트림은 단독으로 사용 불가
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data = bis.read()) != -1) {
			bos.write(data);
			//System.out.println((char)data);  // char는 2byte밖에 안 되는데 한글은 한 글자가 2byte라서 다 깨져나옴
		}
//		byte[] buffer = new byte[1024];
//		int len;
//		while((len = fis.read(buffer))!=-1) {
//			fos.write(buffer, 0, len);
//		}
		bis.close();  // 보조스트림을 닫으면 1차 스트림도 닫힘
		bos.close();
	}

}
