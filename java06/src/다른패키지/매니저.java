package 다른패키지;

import 원래패키지.직원;

//알트+쉬프트+o(영문자) 자동 import
public class 매니저 extends 직원{
	public void test() {
		이름 = "강길동"; //public 
		주소 = "강남구"; //protected
		//다른 패키지라도 상속받은 경우, 접근 가능
	}
}
