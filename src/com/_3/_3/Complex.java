package com._3._3;
/**
 * ��4����дһ���������������֮�ͣ�
 * ������ʽΪ��2��3i��+��4��5i����������6+8i����
 * ������������ͨ���쳣������ʾ����
 * <li>ע�⣬��������֮��ķָ����ǡ�+���ɱ�дһ����������������ʽ�ĸ����ַ���ת��Ϊʵ�ʵĸ�������
 * <li>ע����ȡ�Ӵ��İ���ȡ���ݣ�һ��������x��y���ֵķָ����Ƕ��š�
 * <li>������˼·�������ַ����Ĵ��������������������������������Ӧ�ĸ������󣬵��ø�����add�������м��㡣
 * */
public class Complex {
	private double a;
	private double b;
	public Complex(double a,double b) {
		setA(a);
		setB(b);
	}
	@Override
	public String toString() {
		return " (" + a + "+" + b + "i)";
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public Complex cAdd(Complex a,Complex b) {
		Complex complex=new Complex(a.getA()+b.getA(),a.getB()+b.getB());
		return complex; 
	}
	public Complex cSud(Complex a,Complex b) {
		Complex complex=new Complex(a.getA()-b.getA(),a.getB()-b.getB());
		return complex; 	
	}
}
