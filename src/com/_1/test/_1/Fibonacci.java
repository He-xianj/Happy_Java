package com._1.test._1;

import java.util.Scanner;
/**
 * 1��	Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��
 * �������һ������n
 * ���һ�У�����һ����������ʾFn
 * ��չ��������Ļ����ϣ����Fn����10007��������n>10000 
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
				//ʹF1=F2=1
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
