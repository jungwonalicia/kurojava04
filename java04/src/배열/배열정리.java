package 배열;

public class 배열정리 {

	public static void main(String[] args) {
		//1. 값을 이미 알고 있는 경우
		int[] num = {1, 2, 3, 4, 5};
		
		//2. 값을 모르는 경우
		int[] num2 = new int[5];
//		int num3[] = new int[5];
		
		for (int i = 0; i < num2.length; i++) {
			num2[i] = i + 1;
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(i + ": " + num2[i]);
		}
		
		
		
		
		
		
		
		
	}

}
