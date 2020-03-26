package com._0._5;
/**
 * 153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * 输出格式　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行
 * */
public class R5 {
	public static void main(String[] args) {
		for(int a=1;a<=9;a++) {
			for(int b=0;b<=9;b++) {
				for(int c=0;c<=9;c++) {
					//百位从一、十位从零、个位从零开始枚举
					if((a*100+b*10+c)==(a*a*a+b*b*b+c*c*c))
						//判断是否等于它的每位数字的立方和
						System.out.println(a*a*a+b*b*b+c*c*c);
					//输出满足每位数字的立方和的三位十进制数
				}
			}
		}
	}
}
