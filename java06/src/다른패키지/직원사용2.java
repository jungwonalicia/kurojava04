package 다른패키지;

import 원래패키지.직원;

public class 직원사용2 {

	public static void main(String[] args) {
		직원 emp2 = new 직원();
		emp2.이름 = "박길동";
		//다른 패키지에서는 public만 보임. 
	}
}
