package com._0._8;

public class Teacher extends Person1{
	String[] job;
	String[] department;
	Teacher(String[] name, String[] sex, int[] age,String[] job,String[] department) {
		super(name, sex, age);
		this.job=job;
		this.department=department;
	}
	public void bli() {
		for(int i=0;i<=name.length-1;i++) {
			System.out.print(name[i]);
			System.out.print(sex[i]);
			System.out.print(age[i]);
			System.out.print(job[i]);
			System.out.print(department[i]);
		}
	}

}

