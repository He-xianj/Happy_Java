package com.frist_semester._2;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========简易计算器==========");
		System.out.print("请输入第一个数: x = ");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.print("请输入第二个数: y = ");
		double y = scanner.nextDouble();
		scanner.close();
		System.out.println("运算结果如下");
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x ÷ y = " + (x / y));
	}

}
