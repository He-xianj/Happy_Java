package com._4.test._2;

import java.util.Scanner;
/**
 * ��д��������û����������Ϣ��
 * ���������0��100֮�䣬����ɼ���
 * ����ɼ����ڸ÷�Χ�ڣ��׳��쳣��Ϣ����ʾ����������0��100֮�䡣
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
