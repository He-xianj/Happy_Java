package com._5.test._2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 4��	�ļ������Ķ�д�������ַ����ֽڣ�
 * �ֽ�
 * */
public class RnW {
	public static void main(String[] args) {
		try {
		     input("D:\\1.txt");
		} catch (IOException e){
		     e.printStackTrace();
		}
		try {
		    output("D:\\2.txt");
		    }catch (IOException e) {
		    e.printStackTrace();
		}
	}
		public static void input(String path) throws IOException{
		//1����������
		FileInputStream fin=new FileInputStream(path);
		byte[]buf=new byte[1024];
		int iread=0;//��¼ʵ�ʵĶ�ȡ����
		//3����������ѭ��
		while((iread=fin.read(buf))!=-1) {
		//�����ݵĲ���
		System.out.println(new String(buf));
		System.out.println("����"+iread+"����");
	    }
		//�ر���
		fin.close();
		}
		public static void output(String path) throws IOException{
		//1���������
		FileOutputStream fout=new FileOutputStream(path);
		String string="��Ͷ��.�����ɷ��ɣ�";
		//����
		 fout.write(string.getBytes());
		//�ر�
		fout.close();
	}
}
