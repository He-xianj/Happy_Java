package com._3.test._1;
/**
 * ��������
 * */
public class Triangle {
	private double a=0;
	private double b=0;
	private double c=0;
	/**
	 * ����ֻ�������ܸ������ε����߸�ֵ����
	 * */
	public Triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		if(a+b<c||a+c<b||b+c<a) {
			System.out.println("a,b,c�ĳ��Ȳ����γ�������");
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
 * ���׹�ʽ
 *S=��p(p-a)(p-b)(p-c) 
 *
 * */
	public double mathArea() {
		double p=(a+b+c)/2;
//		ʹ��Math��ķ��������м��㣬�õ����ս��
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}
