package com.frist_semester._2;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========���׼�����==========");
		System.out.print("�������һ����: x = ");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.print("������ڶ�����: y = ");
		double y = scanner.nextDouble();
		scanner.close();
		System.out.println("����������");
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x �� y = " + (x / y));
	}

}
