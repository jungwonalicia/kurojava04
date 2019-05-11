package 부품만들기;

public class 음식점 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int total = cal.add(3500, 2500);
		System.out.println("당신의 지불 금액은 " + total + "원입니다.");
		System.out.println("당신의 실제 지불 금액은 " + cal.minus(total, 1000) + "원입니다.");
	}

}
