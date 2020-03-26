package com._1._1;
import java.util.Arrays;
public class Person {
	private String name;
	private String sex;
	private int age;
	private Person[] children;
	public Person(String name,String sex,int age) {
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void addAge() {
		age=age+1;
	}
	public Person[] getChildren() {
		return children;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + ", children=" + Arrays.toString(children)
				+ "]";
	}
}
