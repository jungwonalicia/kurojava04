package 원래패키지;

public class 직원사용1 {
	public static void main(String[] args) throws Exception {
		직원 emp1 = new 직원();
		emp1.이름 = "홍길동";
//		emp1.주민번호 = "123"; privat불가능
		emp1.play();
	}
}
