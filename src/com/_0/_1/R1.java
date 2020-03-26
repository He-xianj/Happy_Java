package com._0._1;
import java.util.Scanner;
/**
 * 1、Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *    输入包含一个整数n
 *    输出一行，包含一个整数，表示Fn
 * */
public class R1 {
	public static void main(String[] args) {
		System.out.print("n=");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		//输入包含一个整数n
		int fn=0;
		for(int a=1,b=0,d=1;d<=n;d++) {
			if(d==1) {
				continue;
				//使F1=F2=1
			}else {
				fn=a+b;
				//即Fn=Fn-1+Fn-2
				b=a;
				a=fn;
			}
		}
		System.out.println("f"+n+"="+fn);
		//输出一行，包含一个整数，表示Fn
	}
}

