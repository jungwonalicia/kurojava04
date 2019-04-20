package control;

import java.util.Scanner;

public class 나에대한정보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나의 정보 입력 ");
		System.out.println("-------------");
		System.out.print("나이 : ");
		String age = sc.next();
		//컨트롤+알트+화살표 아래(복사)
		//알트+화살표 아래(이동)
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.println(name + "님의 성별은 " 
							+ gender + ", 나이는 " + age + "세" );
		
		
		
		
		
		
	}

}
