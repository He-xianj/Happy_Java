package com._3._3;
import java.util.Scanner;
/**
 * @see Complex
 * */
public class Test {
	public static void main(String[] args) {
		String str_complex;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个复数表达式，例如（2，3i）+（4，5i）");
		str_complex=sc.next();
		sc.close();
		char[] char_c=new char[13];
		try {
			char_c=str_complex.toCharArray();
			if(char_c[6]=='+') {
				Complex c1=new Complex((int)char_c[1]-'0',(int)char_c[3]-'0');
				Complex c2=new Complex((int)char_c[8]-'0',(int)char_c[10]-'0');
				Complex c3=new Complex(0, 0).cAdd(c1, c2);
				System.out.println(c3.toString());
			}else if(char_c[6]=='-') {
				Complex c1=new Complex((int)char_c[1]-'0',(int)char_c[3]-'0');
				Complex c2=new Complex((int)char_c[8]-'0',(int)char_c[10]-'0');
				Complex c3=new Complex(0, 0).cSud(c1, c2);
				System.out.println(c3.toString());
			}else {
				System.out.println("格式错误");
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("异常");
		}
		
	}

}
