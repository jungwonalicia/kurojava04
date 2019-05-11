package 형변환캐스팅;

import java.util.ArrayList;
//컨트롤+쉬프트+o(영문자): 자동 import
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add(100);
		list.add(11.22);
		list.add(true);
		
		String s = (String)list.get(0);
		int i = (int)list.get(1);
		//기본형에 다른 특성들을 붙여서(포장해서) 클래스로 만들어놓음.
		//포장클래스(Wrapper class)
		//기본형과 포장클래스간에는 자동으로 변환 가능
		//int ---(boxing)---> Integer--> Object
		//int <---(unboxing)<--- Integer
		//double --> Double
		
		
		
		
		
		
	}
}
