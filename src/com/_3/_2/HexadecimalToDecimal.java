package com._3._2;
import java.util.Scanner;

/**
 *（2）从键盘输入一个十六进制数，将其转化为十进制输出。如果输入的不是一个有约十六进制数字则抛出异常。
 *<li>【基本思路】十六进制数只限0~9、A~F、a~f的字符，
 *               首先将每位字符转换为对应十进制，
 *               然后用按位乘以基数16进行拼接转换为十进制。 
 * */
public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t=scanner.next();//输入
		scanner.close();
		try {
			int n=Integer.parseInt(t, 16);//转换
			System.out.println(n);//输出
		}catch(NumberFormatException e) {
			System.out.println("异常");//输出
		}
	}

}
