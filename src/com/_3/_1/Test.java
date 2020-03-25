package com._3._1;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;
/**
 * （1）设计一个求n！的方法，结果为一个长整数。编写一个程序从键盘输入一个数给整
 * 数K赋值，然后调用求n!的方法求K！，在程序中规划处理如下异常情况：
 * ① 输入的数不是一个整数，而是实数，则不计算。
 * ② 输入的数据是一个十六进制表示的串，则转化为十进制数，再进行计算。
 * 提示：通过Integer.parseInt(String,16）方法可将串按十六进制识别转化为十进制。
 * 【基本思路】判断输入数据如果是0X开始，则表示为十六进制数据，在将十六进
 * 转换为十进制数据时要去除0X，
 * 将剩余部分用取 Integer类的parseInt(String,16）方法转换十进制整数。
 * */
public class Test {
	public static void main(String[] args) {
		long k=0;
//		long kn=1;
		String c = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("求k！(0<n<20)，k=");
		try {
			k=sc.nextInt();
//			数K赋值
//			kn=hLongK(k);
//			调用求n!的方法求K！
//			System.out.println(kn);
			System.out.println(hLongKn(k));
			sc.close();
		}catch(InputMismatchException e) {
			try {
				c=sc.next();
//				kn=hLongK(c);
				System.out.println(hLongKn(c));
				sc.close();
			}catch(NumberFormatException ex) {
				System.out.println("请输入正确的数值");
			}
		}
	}
	public static long hLongKn(long k) {
		long kn=1;
		if(k<=0) {
			System.out.println("请输入正整数");
			kn=0;
		}else {
			for(long v = 1;v<=k;v++) {		
				kn=v*kn;
			}
		}
		return kn;
	}
	public static long hLongKn(String c) {
		long kn=1;
		long k=0;
		if(c.charAt(0)=='0'&(c.charAt(1)=='X'|c.charAt(1)=='x')) {
			String c1=(String) c.subSequence(2, c.length());
			k=(long)Integer.parseInt(c1, 16);//转换
			System.out.println("即k="+k);
			for(long v = 1;v<=k;v++) {		
				kn=v*kn;
		    }
		}else {
			k=Integer.parseInt(c, 16);//转换
			System.out.println("即k="+k);
			for(long v = 1;v<=k;v++) {		
				kn=v*kn;
		    }
		}
		return kn;
	}
}
