package com._1.test._3;
public class Teacher extends Person {
private String pro;
private String department;
public Teacher(String name, String sex, int age,String pro,String department) {
	super(name, sex, age);
	this.pro=pro;
	this.department=department;
}
public String getPro() {
	return pro;
}
public void setPro(String pro) {
	this.pro = pro;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return  super.toString()+"Teacher [pro=" + pro + ", department=" + department + "]";
}
}

