package 배열;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 파일다루기3 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test3.txt");
		String[] food = {"apple", "banana", "melon"};
		for (int i = 0; i < food.length; i++) {
			file.write(food[i] + "\n");
		}
		file.close();
	}
}





