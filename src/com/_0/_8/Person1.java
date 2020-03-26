package com._0._8;
/**
 * 定义一个Person类，包括姓名、性别、年龄等字段；
 * 继承Person类设计Teracher类，增加职称、部门等字段；
 * 继承Person类设计Student类，增加学号、入学时间、专业等字段。
 * 定义各类的构造方法和toString（）方法，并分别创建对象测试。
 * !!!!我不会定义toString()方法!!!!
**/
public class Person1 {
	String[] name;
	String[] sex;
	int[] age;
	Person1(String[] name,String[] sex,int[] age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void bli() {
		for(int i=0;i<=name.length-1;i++) {
			System.out.print(name[i]);
			System.out.print(sex[i]);
			System.out.print(age[i]);
		}
	}
}

