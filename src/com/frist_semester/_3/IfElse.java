package com.frist_semester._3;

import java.util.Scanner;

public class IfElse {
/**
 * 1、	使用if…else语句，
 * 实现：输入一个学生的成绩，判断成绩的等级，
 * 成绩为90~100，输出“优秀”；
 * 为80~89，输出“良好”； 为60~79，输出“中等”；
 * 其他成绩输出不及格。（不考虑输入的成绩不合法）
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入学生的成绩：");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		if(a <= 100 & a >=90) {
			System.out.println("优秀");
		}else if(a <= 89 & a >=80) {
			System.out.println("良好");
		}else if(a <= 79 & a >=60) {
			System.out.println("中等");
		}else {
			System.out.println("不及格");
		}
	}

}
