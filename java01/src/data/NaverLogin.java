package data;

public class NaverLogin {

	public static void main(String[] args) {
		//비교연산자는 기본타입만 사용 가능!
		// String id = "root";
		// String pw = "1234";
		
		int id = 1111;
		int pw = 2222;
		
		//저장(컨트롤+s),실행(컨트롤+f11)
		System.out.println(id == 1000);
		
		if(id == 1111 && pw == 2222) {
			System.out.println("로그인 OK..");
		} else {
			System.out.println("로그인 NOT");
		}
	}
}
