package 배열;

public class 위치바꾸기 {
	public static void main(String[] args) {
		int[] num = {66, 77, 88, 99};
		int imsi = num[3]; //99를 다른 곳에 옮겨 놓음.
		num[3] = num[0]; //66->99
		num[0] = imsi; //임시로 옮겨놓은 99->66
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
