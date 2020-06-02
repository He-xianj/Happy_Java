package com._11.test._2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Station s1=new Station();
		Thread t1=new Thread(s1," €∆±¥∞1");
		Thread t2=new Thread(s1," €∆±¥∞2");
		Thread t3=new Thread(s1," €∆±¥∞3");
		t1.start();
		t2.start();
		t3.start();
	}

}
