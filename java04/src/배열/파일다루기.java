package 배열;

import java.io.FileWriter;
import java.io.IOException;

public class 파일다루기 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test.txt");
		file.write("hello...\n");
		file.write("hi...\n");
		
		file.close();
		
	}

}
