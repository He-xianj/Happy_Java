package com.frist_semester._3;

import java.util.Scanner;

public class Switchday {
	/**
	 * ʹ��switch���ʵ�֣�������������֣���������������н�����£�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������������ڼ������֣�");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();
		switch (day) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.err.println("������");
			break;
		}
	}

}
