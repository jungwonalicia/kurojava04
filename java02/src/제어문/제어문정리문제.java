package ���;

import java.util.Scanner;

public class ����������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է�: ");
		String name = sc.next();
		System.out.print("�л��� ������ �Է�: ");
		int jumsu = sc.nextInt();
		System.out.print(name + "�л��� ������ ");
		
		if(jumsu >= 90) {
			System.out.println("A���� �Դϴ�.");
		}else if(jumsu >= 80) {
			System.out.println("B���� �Դϴ�.");
		}else if(jumsu >= 70) {
			System.out.println("C���� �Դϴ�.");
		}else if(jumsu >= 60) {
			System.out.println("D���� �Դϴ�.");
		}else {
			System.out.println("F���� �Դϴ�.");
		}
		
	}
}



