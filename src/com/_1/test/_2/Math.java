package com._1.test._2;
/**
 * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 拓展：存在对称的5位十进制数，六位十进制数，并且各位数的和是n，
 * （n是由键盘输入，n>2并且n<=54）。
 * 请从小到大输出。
 * */
public class Math {
	public static void main(String[] args) {
		for(int i=1000;i<10000;i++) {
			int t1=i%10;
			int t2=(i/10)%10;
			int t3=(i/100)%10;
			int t4=i/1000;
			if(t1==t4&&t2==t3) {
				System.out.println(i);
			}
		}
	}
}

