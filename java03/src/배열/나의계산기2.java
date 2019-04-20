package 배열;

import javax.swing.JOptionPane;

public class 나의계산기2 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("숫자1입력");
		int num1 = Integer.parseInt(n1);
		String n2 = JOptionPane.showInputDialog("숫자2입력");
		int num2 = Integer.parseInt(n2);
		
		System.out.println("두 수의 합은 " + (num1 + num2));
		JOptionPane.showMessageDialog(null, "두 수의 합은 " + (num1 + num2));
		
		
		
		
		
		
	}

}
