package com._0._6;
/**
 *��дһ�����������ε��ࡣ���У�3����Ϊ�����ε����ԣ�����װ�������ε�������ܳ��ķ����� 
 * */
public class R6 {//һ�����������ε���
	private int a=0;
	private int b=0;
	private int c=0;
	//3����Ϊ�����ε�����
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
	public double area() {//�����ε��������
		int area=a*b/2;
		return area;
	}

	public int perimeter() {//�����ε��ܳ�����
		int perimeter=a+b+c;
		return perimeter;
	}
}
