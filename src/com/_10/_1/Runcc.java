package com._10._1;

public class Runcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mt t1=new Mt("线程1");
		Mt t2=new Mt("线程2");
		Mt t3=new Mt("线程3");
		t1.start();
		t2.start();
		t3.start();
	}

}
