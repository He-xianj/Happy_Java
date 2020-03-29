package com._3.test._3;
import java.util.Scanner;
/**	做一个100以内的加、减法测试系统。
 * 系统要求，显示某个算式，使用者从键盘输入结果，系统并判断结果是否正确，
 * 若错误给出正确结果，若正确则给出鼓励。
 * 题目一共10道。
 * 要求：（算式是数是随机出现的，加减法也是随机出现的，并且结果不能出现负数。）
 * */
public class Mathaddsud {
	public static void main(String[] args) {	
		for(int cd=1;cd<=10;cd++) {
			int a=(int)(Math.random()*100)+1;
			int b=(int)(Math.random()*100)+1;
			if((int)(Math.random()*100)%2==0) {//奇偶数定加减1/2概率
				for(;a+b>100;) {
					a=(int)(Math.random()*100)+1;
					b=(int)(Math.random()*100)+1;
//					100以内的加法
				}
				System.out.println(a+"+"+b+"="+"?");
				if(new Scanner(System.in).nextInt()==a+b) {
					System.out.println("正确,干得漂亮");
				}else {
					System.out.println("错误，答案"+(a+b));
				}
			}else {
				if(a<b) {
					int c=a;
					a=b;
					b=c;
//					100以内的减法，结果不出现负数
				}
				System.out.println(a+"-"+b+"="+"?");
				if(new Scanner(System.in).nextInt()==a-b) {
					System.out.println("正确，干得漂亮");
				}else {
					System.out.println("错误，答案"+(a+b));
				}
			}
		}
		new Scanner(System.in).close();
	}
}

