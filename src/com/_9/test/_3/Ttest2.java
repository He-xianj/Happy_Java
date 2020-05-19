package com._9.test._3;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 2）、从键盘输入（人名不能太少，10）
 * @see Ttest1
 * */
public class Ttest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[10];
		Scanner sc=new Scanner(System.in);
		for(int n=0;n<s.length;n++) {
			System.out.println("第"+(n+1)+"个名字");
			s[n]=sc.next();
		}
		sc.close();
		ArrayList<String> l=new Ttest1().lToString(s);
		new Ttest1().nuber(l);
	}

}
