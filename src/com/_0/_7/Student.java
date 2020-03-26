package com._0._7;
import java.util.Scanner;
/**
 * 编写一个学生类Student，包含的属性有学号、姓名、年龄，
 * 将所有学生存储在一个数组中，并实现如下操作。
 * 1、将所有学生年龄加1岁。
 * 2、按数组中的顺序显示所有的学生信息。
 * 3、查找显示所有大于20岁的学生名单。
 * */
public class Student {
	String[] information[];
//将所有学生信息存储在一个数组中
	public Student() {
		System.out.print("请输入学生人数：");
		//确定数组的长度
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();	
		information=new String[a][];
		for(int l=0;l<=a-1;l++) {
			information[l]=new String[3];
			//学生信息分别为每一为分配空间
		}
		setInformation();
		otherServe();
		scanner.close();
	}
	public void setInformation() {
		//将所有学生信息存储在一个数组中
		for(int a = 0;a<=information.length-1;a++) {
			for(int b=0;b<=2;b++) {
				if(b==0) {
					//录入学号
					System.out.print("请输入第"+(a+1)+"名学生的学号：");
					information[a][b]=new Scanner(System.in).next();
				}else if(b==1) {
					//录入名字
					System.out.print("请输入第"+(a+1)+"名学生的名字：");
					information[a][b]=new Scanner(System.in).next();
				}else if(b==2) {
					//录入年龄
					System.out.print("请输入第"+(a+1)+"名学生年龄：");
					information[a][b]=new Scanner(System.in).next();
				}
			}
		}
		System.out.println("所有学生信息已录入");
	}
	public void otherServe() {
		//实现如下操作加1岁显示学生信息查找操作方法
		System.out.println("将所有学生年龄加1岁，请输入1");
		System.out.println("显示所有的学生信息，请输入2");
		System.out.println("查找显示所有大于20岁的学生名单，请输入3");
		Scanner scanner = new Scanner(System.in);
		int an=scanner.nextInt();
		scanner.close();
		if(an==1) {
			add();
			//将所有学生年龄加1岁。
		}if(an==2) {
			show();
			//按数组中的顺序显示所有的学生信息。
		}if(an==3) {
			checkOver20();
			//查找显示所有大于20岁的学生名单。
		}else {
			otherServe();
		}
//没有加else目的是展示所有方法
	}
	public void add() {
		//将所有学生年龄加1岁。
		int tAge=0;
		String stAge="0";
		//tAge stAge是用来暂时存转换的数据
		for(int d=0;d<=information.length-1;d++) {
			tAge = Integer.parseInt(information[d][2]);
			tAge=tAge+1;
			stAge=String.valueOf(tAge);
			//这里是S>I>S转换
			information[d][2]=stAge;
		}
	}
	public void show() {
		//按数组中的顺序显示所有的学生信息。
		for(int a = 0;a<=information.length-1;a++) {
			for(int b=0;b<=2;b++) {
				if(b==0) {
					System.out.print("学号:"+information[a][b]);
				}else if(b==1) {
					System.out.print("   名字:"+information[a][b]);
				}else if(b==2) {
					System.out.print("   年龄:"+information[a][b]+"\n");
				}
			}
		}
	}
	public void checkOver20() {
		//查找显示所有大于20岁的学生名单。
		int d=0;
		for(int c=0;c<=information.length-1;c++) {
			d = Integer.parseInt(information[c][2]);
			//这的转换方法是百度回来的
			if(d>=20) { 
				for(int b=0;b<=2;b++) {
					if(b==0) {
						System.out.print("学号:"+information[c][b]);
					}else if(b==1) {
						System.out.print("   名字:"+information[c][b]);
					}else if(b==2) {
						System.out.print("   年龄:"+information[c][b]+"\n");
					}
				}
			}
		}
	}
}

