package com._2.test._2;
public class Test {
	public static void main(String[] args) {
		int x1=46;
		int x2=67;
		UseCompute u=new UseCompute();
		u.useCom(new Add(), x1, x2);
		u.useCom(new Subtract(), 10, 1);
		u.useCom(new Multiply(), 11, 9);
		u.useCom(new Divide(), 99, 9);
	}
}
