package com._1.test._3;
/**
 * ������һ��Person�࣬�����������Ա�������ֶΣ�
 * �̳�Person�����Teracher�࣬����ְ�ơ����ŵ��ֶΣ�
 * �̳�Person�����Student�࣬����ѧ�š���ѧʱ�䡢רҵ���ֶΡ�
 * �������Ĺ��췽����toString�������������ֱ𴴽�������ԡ�
 * ��չ��SetNameʱ��������ȥ���ո�
 * Set Ageʱ��age>0
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

