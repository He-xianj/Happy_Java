package com._1._5;
public class Rectangle implements Shape {
	private double a;
	private double b;
	public Rectangle(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public double side() {
		// TODO Auto-generated method stub
		return a*b;
	}
}
