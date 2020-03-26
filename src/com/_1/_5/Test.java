package com._1._5;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(1,3);
		Circle c1=new Circle(5);
		Cylinder c3=new Cylinder(4,5);
		Shape[] g = new Shape[3];
		g[0]=r1;
		g[1]=c1;
		g[2]=c3;
		System.out.println(g[0].side());
		System.out.println(g[1].side());
		System.out.println(g[2].side());
	}
}

