package com._10.test;

public class Student {
	private String sId=null;
	private String name="ÎÞ";
	public Student() {}
	public Student(String sId,String name,int age,String sex) {
		setsId(sId);
		setName(name);
		setAge(age);
		setSex(sex);
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private int age=0;
	private String sex="Î´Öª";
}
