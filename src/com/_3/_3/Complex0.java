package com._3._3;
import java.util.Arrays;
import java.util.Scanner;

import com._2.test._2.Add;
/**
 * （4）编写一个程序计算两复数之和，
 * 输入表达式为（2，3i）+（4，5i），则结果（6+8i），
 * 如果输入错误则通过异常处理提示错误。
 * <li>注意，两个复数之间的分隔符是“+”可编写一个方法将带括号形式的复数字符串转化为实际的复数对象。
 * <li>注意用取子串的办提取数据，一个复数内x和y部分的分隔符是逗号。
 * <li>【基本思路】利用字符串的处理方法将两个复数分离出来，并创建相应的复数对象，调用复数的add方法进行计算。
 * */
public class Complex0 {
	public static void main(String[] args) {
		String complex;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个复数表达式，例如（2，3i）+（4，5i）");
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
