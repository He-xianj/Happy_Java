package com._2._2;
/**
 * 使用Random类，随机输出10个A-Z的字符。
 **/
public class Testrandom {
	public static void main(String[] args) {
		for(int i=1,b=0;i<=10;i++) {
			b=(int) (Math.random()*100);
			if(b>=66&&b<=90) {
				System.out.print((char)b);
			}else {
				i--;
			    continue;
			}
		}
	}
}
