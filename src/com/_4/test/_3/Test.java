package com._4.test._3;

import java.util.Scanner;
/**写一个方法void isTriangle(int a,int b,int c)，
 * 判断三个参数是否能构成一个三角形， 
 * 如果不能，则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
 * 如果可以构成则显示三角形三个边长，
 * 在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
 * */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		try {
			new Test().isTriangle(a, b, c);
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
	}
	void isTriangle(int a,int b,int c) throws IllegalArgumentException {
		if(a+b<c||a+c<b||b+c<a) 
			throw new IllegalArgumentException();
		System.out.println("三角形构造成功");
	}

}
