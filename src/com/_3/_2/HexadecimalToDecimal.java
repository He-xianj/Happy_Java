package com._3._2;
import java.util.Scanner;

/**
 * 
 * */
public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t=scanner.next();//输入
		scanner.close();
		try {
			int n=Integer.parseInt(t, 16);//转换
			System.out.println(n);//输出
		}catch(NumberFormatException e) {
			System.out.println("异常");//输出
		}
	}

}
