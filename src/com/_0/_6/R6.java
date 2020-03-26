package com._0._6;
/**
 *编写一个代表三角形的类。其中，3条边为三角形的属性，并封装有三角形的面积和周长的方法。 
 * */
public class R6 {//一个代表三角形的类
	private int a=0;
	private int b=0;
	private int c=0;
	//3条边为三角形的属性
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public double area() {//三角形的面积方法
		int area=a*b/2;
		return area;
	}

	public int perimeter() {//三角形的周长方法
		int perimeter=a+b+c;
		return perimeter;
	}
}
