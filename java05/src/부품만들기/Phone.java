package 부품만들기;

public class Phone {
//정적특징->멤버변수
	//휴대폰이름, 사이즈
String name;
int size;

//동적특징->멤버메소드
	//전화하다, 검색하다.
public void tel() {
	System.out.println("전화하다.");
}
public String find() {
	return "구글사이트";
}
//1. 메소드를 만든다.
//메소드이름: game()
//게임하다, 10 리턴
public int game() {
	return 10;
}

//카톡하다. kakaotalk()
//리턴: "홍길동"

public String kakaotalk() {
	return "홍길동";
}




}
