package com._1.test._3;
/**
 * 、定义一个Person类，包括姓名、性别、年龄等字段；
 * 继承Person类设计Teracher类，增加职称、部门等字段；
 * 继承Person类设计Student类，增加学号、入学时间、专业等字段。
 * 定义各类的构造方法和toString（）方法，并分别创建对象测试。
 * 扩展：SetName时，姓名，去掉空格。
 * Set Age时，age>0
 * */
public class Person {
private String name;
private String sex;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person(String name,String sex,int age) {
	this.name=name;
	this.sex=sex;
	this.age=age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
}
}

