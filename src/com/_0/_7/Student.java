package com._0._7;
import java.util.Scanner;
/**
 * ��дһ��ѧ����Student��������������ѧ�š����������䣬
 * ������ѧ���洢��һ�������У���ʵ�����²�����
 * 1��������ѧ�������1�ꡣ
 * 2���������е�˳����ʾ���е�ѧ����Ϣ��
 * 3��������ʾ���д���20���ѧ��������
 * */
public class Student {
	String[] information[];
//������ѧ����Ϣ�洢��һ��������
	public Student() {
		System.out.print("������ѧ��������");
		//ȷ������ĳ���
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();	
		information=new String[a][];
		for(int l=0;l<=a-1;l++) {
			information[l]=new String[3];
			//ѧ����Ϣ�ֱ�ΪÿһΪ����ռ�
		}
		setInformation();
		otherServe();
		scanner.close();
	}
	public void setInformation() {
		//������ѧ����Ϣ�洢��һ��������
		for(int a = 0;a<=information.length-1;a++) {
			for(int b=0;b<=2;b++) {
				if(b==0) {
					//¼��ѧ��
					System.out.print("�������"+(a+1)+"��ѧ����ѧ�ţ�");
					information[a][b]=new Scanner(System.in).next();
				}else if(b==1) {
					//¼������
					System.out.print("�������"+(a+1)+"��ѧ�������֣�");
					information[a][b]=new Scanner(System.in).next();
				}else if(b==2) {
					//¼������
					System.out.print("�������"+(a+1)+"��ѧ�����䣺");
					information[a][b]=new Scanner(System.in).next();
				}
			}
		}
		System.out.println("����ѧ����Ϣ��¼��");
	}
	public void otherServe() {
		//ʵ�����²�����1����ʾѧ����Ϣ���Ҳ�������
		System.out.println("������ѧ�������1�꣬������1");
		System.out.println("��ʾ���е�ѧ����Ϣ��������2");
		System.out.println("������ʾ���д���20���ѧ��������������3");
		Scanner scanner = new Scanner(System.in);
		int an=scanner.nextInt();
		scanner.close();
		if(an==1) {
			add();
			//������ѧ�������1�ꡣ
		}if(an==2) {
			show();
			//�������е�˳����ʾ���е�ѧ����Ϣ��
		}if(an==3) {
			checkOver20();
			//������ʾ���д���20���ѧ��������
		}else {
			otherServe();
		}
//û�м�elseĿ����չʾ���з���
	}
	public void add() {
		//������ѧ�������1�ꡣ
		int tAge=0;
		String stAge="0";
		//tAge stAge��������ʱ��ת��������
		for(int d=0;d<=information.length-1;d++) {
			tAge = Integer.parseInt(information[d][2]);
			tAge=tAge+1;
			stAge=String.valueOf(tAge);
			//������S>I>Sת��
			information[d][2]=stAge;
		}
	}
	public void show() {
		//�������е�˳����ʾ���е�ѧ����Ϣ��
		for(int a = 0;a<=information.length-1;a++) {
			for(int b=0;b<=2;b++) {
				if(b==0) {
					System.out.print("ѧ��:"+information[a][b]);
				}else if(b==1) {
					System.out.print("   ����:"+information[a][b]);
				}else if(b==2) {
					System.out.print("   ����:"+information[a][b]+"\n");
				}
			}
		}
	}
	public void checkOver20() {
		//������ʾ���д���20���ѧ��������
		int d=0;
		for(int c=0;c<=information.length-1;c++) {
			d = Integer.parseInt(information[c][2]);
			//���ת�������ǰٶȻ�����
			if(d>=20) { 
				for(int b=0;b<=2;b++) {
					if(b==0) {
						System.out.print("ѧ��:"+information[c][b]);
					}else if(b==1) {
						System.out.print("   ����:"+information[c][b]);
					}else if(b==2) {
						System.out.print("   ����:"+information[c][b]+"\n");
					}
				}
			}
		}
	}
}

