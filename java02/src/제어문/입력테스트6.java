package 제어문;

import java.util.Date;

public class 입력테스트6 {
//	3,4,5 봄
//	6,7,8 여름
//	9,10,11 가을
//	나머지 겨울
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		}else if(month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		}else if(month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}

	}
}





