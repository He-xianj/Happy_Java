package com._3._3;
import java.util.Arrays;
import java.util.Scanner;

import com._2.test._2.Add;
/**
 * ��4����дһ���������������֮�ͣ�
 * ������ʽΪ��2��3i��+��4��5i����������6+8i����
 * ������������ͨ���쳣������ʾ����
 * <li>ע�⣬��������֮��ķָ����ǡ�+���ɱ�дһ����������������ʽ�ĸ����ַ���ת��Ϊʵ�ʵĸ�������
 * <li>ע����ȡ�Ӵ��İ���ȡ���ݣ�һ��������x��y���ֵķָ����Ƕ��š�
 * <li>������˼·�������ַ����Ĵ��������������������������������Ӧ�ĸ������󣬵��ø�����add�������м��㡣
 * */
public class Complex0 {
	public static void main(String[] args) {
		String complex;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���������ʽ�����磨2��3i��+��4��5i��");
		complex=sc.next();
		sc.close();
		complex=AddSub(complex);
		System.out.println(complex);
	}
	public static String AddSub(String complex) {
		String newcomplex = null;
		char[] char_c=new char[13];
			char_c=complex.toCharArray();
			System.out.println(Arrays.toString(char_c));
			if(char_c[6]=='+') {
				newcomplex="("+(int)(char_c[1]-'0'+char_c[8]-'0')+"+"
			                  +(int)(char_c[3]-'0'+char_c[10]-'0')+"i"+")";
			}else if(char_c[6]=='-') {
				newcomplex="("+(int)(char_c[1]-'0'-char_c[8]-'0')+"+"
		                  +(int)(char_c[3]-'0'-char_c[10]-'0')+"i"+")";
			}
			return newcomplex;

	}
}
