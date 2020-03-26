package com._0._8;
public class Student extends Person1{
	int[] sId;
	String[] major;
	int[] date;
	Student(String[] name, String[] sex, int[] age,int[] sId,String[] major,int[] date) {
		super(name, sex, age);
		this.sId=sId;
		this.major=major;
		this.date=date;
	}
	public void bli() {
		for(int i=0;i<=name.length-1;i++) {
			System.out.print(name[i]);
			System.out.print(sex[i]);
			System.out.print(age[i]);
			System.out.print(sId[i]);
			System.out.print(date[i]);
		}
	}
}

