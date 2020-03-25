package com._2._1;
/**
 *使用Math类中的方法随机输出10个1-100的随机数。
 * */
public class Testanom {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println((int)(Math.random()*10));
		}
	}
}
