package 부품만들기;

public class 선풍기 {
	//특징, 특성
	//1. 눈에 보이는 특징(정적)-색, 키=> 변수
	String  color;
	int size;
	
	//2. 동작에 대한 특징(동적)-멈추다, 강풍으로 틀다
	//=> 메소드
	public void stop() {
		System.out.println("멈추다.");
	}
	public void strong() {
		System.out.println("강품으로 틀다.");
	}
	
	
	
}
