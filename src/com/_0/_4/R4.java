package com._0._4;

import java.util.Scanner;

/**
 * �Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
 * ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
 * ��������:FFFF
 * �������:65535
 * */
public class R4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t=scanner.next();//����
		scanner.close();
		int n=Integer.parseInt(t, 16);//ת��
         //�����ٶȰǻ�����
		System.out.println(n);//���
	}
}

