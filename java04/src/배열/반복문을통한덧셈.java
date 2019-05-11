package 배열;

public class 반복문을통한덧셈 {

	public static void main(String[] args) {
		int sum = 0;
		int[] num = {10, 20, 30, 40, 50};
//		num[5] = 100;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
			//i = 0, 0 + 10, sum = 10
			//i = 1, 10 + 20, sum = 30
		}
		System.out.println("총 합계: " + sum);
		System.out.println("평 균: " + sum/num.length);
		
		
	}

}



