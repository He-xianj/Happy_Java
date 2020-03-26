package com._1.test._3;
public class Student  extends Person{
private int sId;
private int date;
private String major;
public Student(String name, String sex, int age,int sId,int date,String major) {
	super(name, sex, age);
	this.sId=sId;
	this.date=date;
	this.major=major;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
@Override
public String toString() {
	return super.toString()+"Student [sId=" + sId + ", date=" + date + ", major=" + major + "]";
}
}

