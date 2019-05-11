package 원래패키지;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		ski.remove(1);
		System.out.println(ski);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i + 1 +  "등: " + ski.get(i));
		}
	}
}





