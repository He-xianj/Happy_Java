package com._6.test._1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIn {

	public static void main(String[] args) {
		File f=new File("D:\\order.txt");
		FileInputStream fin;
		try {
			fin = new FileInputStream(f);
			DataInputStream dis=new DataInputStream(fin);
			String name=null;
			float price=0.0f;
			int num=0;
			char temp[]=null;
			int len=0;
			char c=0;
			while(true) {
				temp=new char[256];
				len=0;
				while((c=dis.readChar())!='\t') {
					temp[len]=c;
					len++;
				}
				name=new String(temp,0,len);
				price=dis.readFloat();
				dis.readChar();
				num=dis.readInt();
				dis.readChar();
				System.out.printf("名称：%s;价格:%5.2f;数量：%d\n", name,price,num);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
