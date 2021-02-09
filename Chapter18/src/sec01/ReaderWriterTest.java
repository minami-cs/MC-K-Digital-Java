package sec01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("news.txt");
		FileWriter fw = new FileWriter("copy2.txt");
		
		BufferedReader br = new BufferedReader(fr);  // 성능이 향상됨
		BufferedWriter bw = new BufferedWriter(fw);
		
		int data;
		while((data = fr.read()) != -1) {
			fw.write(data);
			System.out.println((char)data);
		}
		
		br.close();
		bw.close();
	}
}
