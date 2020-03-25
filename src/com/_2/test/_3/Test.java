package com._2.test._3;
public class Test {
	public static void main(String[] args) {
		Cylinder t1=new Cylinder();
		t1.setColor("À¶É«");
		t1.setHeight(6);
		t1.setRadius(5);
		System.out.println(t1.area());
		t1.volume();
		A ji=t1;
		System.out.println(ji.area());
	}
}
