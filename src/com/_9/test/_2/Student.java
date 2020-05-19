package com._9.test._2;
/**(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)*/
public class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Student(String name,int age){
		setName(name);
		setAge(age);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
