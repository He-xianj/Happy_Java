package com._4.test._2;

import java.util.Scanner;
/**
 * 编写程序接收用户输入分数信息，
 * 如果分数在0—100之间，输出成绩。
 * 如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 * */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		sc.close();
		try {
			
			if(s<0||s>100) throw new SorceException();
		}catch(SorceException e) {
			System.out.println(e.getMessage());
		}
	}

}
