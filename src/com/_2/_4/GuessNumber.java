package com._2._4;
import java.util.Scanner;
/**猜字小游戏：随机生成1-100中的某个整数t，从键盘输入一个数n，
 * 如果输入的数n=t，恭喜猜对，并输出一共猜的m次猜成功。
 * 如果n>t,提示输入数据过大。如果n<t,提示输入数据过小。
 * */
public class GuessNumber {
	static int a=(int)(Math.random()*100)+1;
	static int m=0;
	public static void main(String[] args) {
		System.out.println("从键盘输入一个数");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		guess(n);
		scanner.close();
	}
	public static  void guess(int g) {
		if(a==g) {
			System.out.println("恭喜猜对");
			System.out.println("一共猜的"+(m+1)+"次猜成功");
			return;
		}else if(a>g) {
			System.out.println("输入数据过小");
			m++;
			if(m==10) {
				System.out.println("结束");
				return;
			}
			guess(new Scanner(System.in).nextInt());
		}else if(a<g) {
			System.out.println("输入数据过大");
			m++;
			if(m==5) {
				System.out.println("结束");
				return;
			}			
			guess(new Scanner(System.in).nextInt());
		}
	}
}
