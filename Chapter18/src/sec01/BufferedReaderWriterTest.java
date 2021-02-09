package sec01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterTest {

	public static void main() throws IOException {
		FileWriter fw = new FileWriter("info.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int age = 20;
		double height = 159.5;
		String name = "한지민";
		String info = name + "#" + age + "#" + height;
		bw.write(info);
		bw.newLine();
		age = 23;
		height = 174.2;
		name = "정유미";
		info = name + "#" + age + "#" + height;
		bw.write(info);
		bw.newLine();
		bw.close();
		
	}

	public static void readInfo() throws IOException {
		FileReader fr = new FileReader("info.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		String[] its;
		while((line=br.readLine())!=null) {
			//System.out.println(line);
			its = line.split("#");
			String name = its[0];
			int age = Integer.parseInt(its[1]);
			double height = Double.parseDouble(its[2]);
			System.out.printf("이름: %s, 나이: %d, 키: %.1f\n", name, age, height);
		}
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		//writeInfo();
		readInfo();
//		String str = "apple,banana,orange";
//		String[] fruit = str.split(",");
//		for(String s : fruit) {
//			System.out.println(s);
//		}
	}
}
