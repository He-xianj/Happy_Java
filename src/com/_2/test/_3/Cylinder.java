package com._2.test._3;
public class Cylinder implements C {
	private double radius;
	private double height;
	private String color;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius+2*PI*radius*height;
	}

	@Override
	public void setColor(String c) {
		// TODO Auto-generated method stub
		this.color=c;
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println(PI*radius*radius*height);
	}
}
