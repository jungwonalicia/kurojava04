package 제어문;

import java.util.Date;

public class 시간계산부품사용 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours(); //시각을 구해줌.
		System.out.println("현재 시각은 " + hour);
		int m = date.getMinutes();
		//복사 : 컨트롤+알트+화살표 아래
		//이동 : 알트+화살표
		System.out.println("현재 분은 " + m);
		int s = date.getSeconds();
		System.out.println("현재 초는 " + s);
		int y = date.getYear() + 1900;
		System.out.println("올해는 " + y);
		int month = date.getMonth() + 1;
		System.out.println("이번 달은 " + month);
		
	}

}




