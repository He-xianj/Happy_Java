package com._0._2;
import java.util.Scanner;
/**
 * ����һ����ݣ��ж���һ���ǲ������ꡣ���������֮һ����ʱ����һ�������꣺
 * 1. �����4�ı���������100�ı�����
 * 2. �����400�ı�����
 * ��������ݶ��������ꡣ
 * �����ʽ�������һ������y����ʾ��ǰ����ݡ�
 * �����ʽ���һ�У������������������꣬�����yes���������no�� 
 * */
public class Two {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y=scanner.nextInt();
		scanner.close();
		//	�������һ������y����ʾ��ǰ����ݡ�
		if(y%4==0&y%100!=0) {
			//�ж���һ���ǲ�������
			System.out.println("yes");
			//�����4�ı���&����100�ı�����
		}else {
			if(y%400==0) {
				System.out.println("yes");
				// ���������400�ı���
			 }else {
				 System.out.println("no");
				 //��������ݶ���������,���no��
			 }	
		}
	}
}

