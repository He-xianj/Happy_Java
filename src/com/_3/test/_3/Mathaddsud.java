package com._3.test._3;
import java.util.Scanner;
/**	��һ��100���ڵļӡ���������ϵͳ��
 * ϵͳҪ����ʾĳ����ʽ��ʹ���ߴӼ�����������ϵͳ���жϽ���Ƿ���ȷ��
 * �����������ȷ���������ȷ�����������
 * ��Ŀһ��10����
 * Ҫ�󣺣���ʽ������������ֵģ��Ӽ���Ҳ��������ֵģ����ҽ�����ܳ��ָ�������
 * */
public class Mathaddsud {
	public static void main(String[] args) {	
		for(int cd=1;cd<=10;cd++) {
			int a=(int)(Math.random()*100)+1;
			int b=(int)(Math.random()*100)+1;
			if((int)(Math.random()*100)%2==0) {//��ż�����Ӽ�1/2����
				for(;a+b>100;) {
					a=(int)(Math.random()*100)+1;
					b=(int)(Math.random()*100)+1;
//					100���ڵļӷ�
				}
				System.out.println(a+"+"+b+"="+"?");
				if(new Scanner(System.in).nextInt()==a+b) {
					System.out.println("��ȷ,�ɵ�Ư��");
				}else {
					System.out.println("���󣬴�"+(a+b));
				}
			}else {
				if(a<b) {
					int c=a;
					a=b;
					b=c;
//					100���ڵļ�������������ָ���
				}
				System.out.println(a+"-"+b+"="+"?");
				if(new Scanner(System.in).nextInt()==a-b) {
					System.out.println("��ȷ���ɵ�Ư��");
				}else {
					System.out.println("���󣬴�"+(a+b));
				}
			}
		}
		new Scanner(System.in).close();
	}
}

