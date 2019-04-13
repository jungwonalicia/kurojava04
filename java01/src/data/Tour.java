package data;

public class Tour {

	public static void main(String[] args) {
//		클래스이름: Tour.java
//		나의 여행에 대한 정보
//		다음 데이터를 변수에 저장
//		여행지 예상금액 = 50000
//		예상금액이 30000원 이상이면, 
//				아르바이트를 해야해요.
//			   아니면 
//				지금 돈으로 충분해요.
		//RAM에 저장공간 money를 만들어주세요.의미.
		//4바이트 크기
		
		int money; //선언!
		
		money = 50000;
		System.out.println(money);
		
		
		if(money > 30000) {
			System.out.println("아르바이트를 해야해요.");
		}else {
			System.out.println("지금 돈으로 충분해요.");
		}
	}

}
