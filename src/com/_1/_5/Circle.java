package com._1._5;
public class Circle implements Shape {
	private double r;
	public Circle(double r) {
		this.r=r;
	}
	public double side() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
}

