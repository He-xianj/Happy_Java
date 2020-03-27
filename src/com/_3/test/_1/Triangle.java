package com._3.test._1;
/**
 * 三角形类
 * */
public class Triangle {
	private double a=0;
	private double b=0;
	private double c=0;
	/**
	 * ！！只有这里能给三角形的三边赋值！！
	 * */
	public Triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		if(a+b<c||a+c<b||b+c<a) {
			System.out.println("a,b,c的长度不能形成三角形");
		}
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
/**
 * 海伦公式
 *S=√p(p-a)(p-b)(p-c) 
 *
 * */
	public double mathArea() {
		double p=(a+b+c)/2;
//		使用Math类的方法，进行计算，得到最终结果
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}
