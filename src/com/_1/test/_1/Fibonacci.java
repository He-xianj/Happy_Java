package com._1.test._1;

import java.util.Scanner;
/**
 * 1、	Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 * 输入包含一个整数n
 * 输出一行，包含一个整数，表示Fn
 * 拓展：在上题的基础上，求出Fn除以10007的余数。n>10000 
 **/
public class Fibonacci {
	public static void main(String[] args) {
		System.out.print("n=");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int fn=0;
		for(int a=1,b=0,d=1;d<=n;d++) {
			if(d==1) {
				continue;
				//使F1=F2=1
			}else {
				fn=a+b;
				b=a;
				a=fn;
			}
		}
		System.out.println("fn="+fn);
		scanner.close();
	}
}
