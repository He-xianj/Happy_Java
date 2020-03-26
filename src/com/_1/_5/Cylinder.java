package com._1._5;
public class Cylinder implements Shape {
	private double r;
	private double h;
	public Cylinder(double r, double h) {
		// TODO Auto-generated constructor stub
		this.r=r;
		this.h=h;
	}
	public double side() {
		// TODO Auto-generated method stub
		return 2*3.14*r*h+2*r*r*2;
	}
}
