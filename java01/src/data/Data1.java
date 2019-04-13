package data;

public class Data1 {

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		
		//연산 결과를 확인만 해도 된다면 그냥 print 
		System.out.println(num1 + num2);
		
		//연산의 결과값을 이용해서 다시 연산에 사용하는 경우는
		//연산 결과를 변수에 넣어준다.
		int num3 = num1 + num2;
		System.out.println(num3 + 10);
		
		System.out.println(num1 > num2);

	}

}
