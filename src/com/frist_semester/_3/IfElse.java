package com.frist_semester._3;

import java.util.Scanner;

public class IfElse {
/**
 * 1��	ʹ��if��else��䣬
 * ʵ�֣�����һ��ѧ���ĳɼ����жϳɼ��ĵȼ���
 * �ɼ�Ϊ90~100����������㡱��
 * Ϊ80~89����������á��� Ϊ60~79��������еȡ���
 * �����ɼ���������񡣣�����������ĳɼ����Ϸ���
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ѧ���ĳɼ���");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		if(a <= 100 & a >=90) {
			System.out.println("����");
		}else if(a <= 89 & a >=80) {
			System.out.println("����");
		}else if(a <= 79 & a >=60) {
			System.out.println("�е�");
		}else {
			System.out.println("������");
		}
	}

}
