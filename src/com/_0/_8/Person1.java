package com._0._8;
/**
 * ����һ��Person�࣬�����������Ա�������ֶΣ�
 * �̳�Person�����Teracher�࣬����ְ�ơ����ŵ��ֶΣ�
 * �̳�Person�����Student�࣬����ѧ�š���ѧʱ�䡢רҵ���ֶΡ�
 * �������Ĺ��췽����toString�������������ֱ𴴽�������ԡ�
 * !!!!�Ҳ��ᶨ��toString()����!!!!
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

