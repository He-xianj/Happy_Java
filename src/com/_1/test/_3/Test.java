package com._1.test._3;
public class Test {
	public static void main(String[] args) {
		Person p1=new Person("张三", "男", 25);
		System.out.println(p1.toString());
		Teacher t1=new Teacher("李四","女",32,"教授","信息系");
		System.out.println(t1.toString());
		Student s1=new Student("小米","女",18,1234,1909,"软件工程");
		System.out.println(s1.toString());
	}

}

