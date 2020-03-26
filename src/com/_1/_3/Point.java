package com._1._3;
public class Point {
	private double x;
	private double y;
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distance(Point p) {
		//��㵽p������
//		(x-p.getX())^2+(y-p.getY())^2
		return Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
	}
	public double distance(int x,int y) {
		//1��㵽��xy����֮�����
		return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y*(y-this.y)));
	}
	public static double distance(Point x,Point y) {
		//�� x��y��������
		return Math.sqrt((x.getX()-y.getX())*(x.getX()-y.getX())+(x.getY()-y.getY())*(x.getY()-y.getY()));
	}
}
