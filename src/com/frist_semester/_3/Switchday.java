package com.frist_semester._3;

import java.util.Scanner;

public class Switchday {
	/**
	 * 使用switch语句实现：根据输入的数字，输出星期数。运行结果如下：
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入代表星期几的数字：");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();
		switch (day) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.err.println("？？？");
			break;
		}
	}

}
