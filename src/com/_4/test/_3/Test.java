package com._4.test._3;

import java.util.Scanner;
/**дһ������void isTriangle(int a,int b,int c)��
 * �ж����������Ƿ��ܹ���һ�������Σ� 
 * ������ܣ����׳��쳣IllegalArgumentException����ʾ�쳣��Ϣ ��a,b,c���ܹ��������Ρ���
 * ������Թ�������ʾ�����������߳���
 * ���������еõ���������������������� ���ô˷������������쳣��
 * */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		try {
			new Test().isTriangle(a, b, c);
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
	}
	void isTriangle(int a,int b,int c) throws IllegalArgumentException {
		if(a+b<c||a+c<b||b+c<a) 
			throw new IllegalArgumentException();
		System.out.println("�����ι���ɹ�");
	}

}
