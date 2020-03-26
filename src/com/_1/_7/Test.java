package com._1._7;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meet n=new Meet();
		Car r=new Car();
		StartStop[] t= {n,r};
		t[0].start();
		t[0].stop();
		t[1].start();
		t[1].stop();
		
	}
}

