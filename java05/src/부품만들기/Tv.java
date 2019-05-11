package 부품만들기;

public class Tv {
	//특징, 특성
	//정적특성: 크기, 모양=> 변수
	//동적특성: 켜다, 끄다, 채널을바꾸다=> 메소드
	int size;
	String shape;
	
	//객체 생성시 자동 호출되는 메소드(생성자 메소드)
	public Tv() {
		System.out.println("객체 생성시 자동 호출되는 특별한 메소드");
	}
	
	public void powerOn() {
		System.out.println("TV를 켜다.");
	}
	public void powerOff() {
		System.out.println("TV를 끄다.");
	}
	public void changeCh() {
		System.out.println("채널을 바꾸다.");
	}
	
	//복사할 변수 프린트(toString())
	public String toString() {
		return shape + ", " + size;
	}
	
	

}
