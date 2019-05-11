package 배열;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 파일다루기2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test2.txt");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			String data = sc.next();
			file.write(data + "\n");
		}
		file.close();
		
	}

}
