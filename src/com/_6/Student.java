package com._6;

public class Student{
	private int sId=0;
	private String name="��";
	private int age=0;
	private String sex="δ֪";
	private int Matchachievement=0;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
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
		if(sex=="��"||sex=="Ů") {
			this.sex = sex;
		}else {
			System.out.println("�Ա��ʽ����Ĭ��ΪŮ");
			this.sex = "Ů";
		}
		
	}
	public Student() {}
	public Student(int sId,String name,int age,String sex) {
		setsId(sId);
		setName(name);
		setAge(age);
		setSex(sex);
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public int getMatchachievement() {
		return Matchachievement;
	}
	public void setMatchachievement(int matchachievement) {
		Matchachievement = matchachievement;
	}
}
