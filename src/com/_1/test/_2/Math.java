package com._1.test._2;
/**
 * 1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
 * ��չ�����ڶԳƵ�5λʮ����������λʮ�����������Ҹ�λ���ĺ���n��
 * ��n���ɼ������룬n>2����n<=54����
 * ���С���������
 * */
public class Math {
	public static void main(String[] args) {
		for(int i=1000;i<10000;i++) {
			int t1=i%10;
			int t2=(i/10)%10;
			int t3=(i/100)%10;
			int t4=i/1000;
			if(t1==t4&&t2==t3) {
				System.out.println(i);
			}
		}
	}
}

