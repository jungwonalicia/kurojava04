package 에러;

public class 에러클래스 {
	public static void main(String[] args) {
		try {
			int[] num = {1, 2, 3};
			num[3] = 100;
		}catch (Exception e) {
			System.out.println("에러발생!! 내가 처리함.");
		}
		
		System.out.println("나는 실행될까요???");
	}
}
