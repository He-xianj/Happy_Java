package com._0._4;

import java.util.Scanner;

/**
 * 从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 * 注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * 样例输入:FFFF
 * 样例输出:65535
 * */
public class R4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t=scanner.next();//输入
		scanner.close();
		int n=Integer.parseInt(t, 16);//转换
         //方法百度扒回来的
		System.out.println(n);//输出
	}
}

