package com._3._3;
/**
 * （4）编写一个程序计算两复数之和，
 * 输入表达式为（2，3i）+（4，5i），则结果（6+8i），
 * 如果输入错误则通过异常处理提示错误。
 * <li>注意，两个复数之间的分隔符是“+”可编写一个方法将带括号形式的复数字符串转化为实际的复数对象。
 * <li>注意用取子串的办提取数据，一个复数内x和y部分的分隔符是逗号。
 * <li>【基本思路】利用字符串的处理方法将两个复数分离出来，并创建相应的复数对象，调用复数的add方法进行计算。
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
