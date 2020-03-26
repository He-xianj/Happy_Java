package com._1._1;
public class test {
	public static void main(String[] args) {
		Person p1=new Person("张三", "男", 25);
		Person p2=new Person("张三丰","男",8);
		Person p3=new Person("张丽丽","女",9);
		Person[] children=new Person[2];
		children[0]=p2;
		children[1]=p3;
		p1.setChildren(children);
		System.out.println(p1.toString());
		
	}

}
