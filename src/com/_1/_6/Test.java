package com._1._6;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		a.setWeight(77);
		Peach b=new Peach();
		b.setWeight(68);
		Orange c=new Orange();
		c.setWeight(56);
		Fruits[] s= {a,b,c};
		System.out.println(s[0].getClass().getName()+s[0].getWeight());
		System.out.println(s[1].getClass().getName()+s[1].getWeight());
		System.out.println(s[2].getClass().getName()+s[2].getWeight());
	}

}

