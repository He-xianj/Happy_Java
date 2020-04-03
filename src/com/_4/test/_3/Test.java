package com._4.test._3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		sc.close();
		try {
			if(a+b<c||a+c<b||b+c<a) 
				throw new TriangleExcption();
			System.out.println("三角形构造成功");
			}catch(TriangleExcption e) {
				System.out.println(e.getMessage());
			}
	}

}
