package com._1._3;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point(1.0,1.0);
		Point b=new Point(1,2);
		Point c=new Point(3,4);
		Point d=new Point(6.6,3.5);
		System.out.println(d.distance(a));
		System.out.println(Point.distance(c, b));
		System.out.println(c.distance(0, 0));
		System.out.println(b.distance(7, 7));
	}

}

