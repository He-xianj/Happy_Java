package com._5.test._2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 4、	文件基本的读写操作（字符，字节）
 * 字节
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
		//1、打开输入流
		FileInputStream fin=new FileInputStream(path);
		byte[]buf=new byte[1024];
		int iread=0;//记录实际的读取长度
		//3、读操作，循环
		while((iread=fin.read(buf))!=-1) {
		//对数据的操作
		System.out.println(new String(buf));
		System.out.println("读了"+iread+"个。");
	    }
		//关闭流
		fin.close();
		}
		public static void output(String path) throws IOException{
		//1、打开输出流
		FileOutputStream fout=new FileOutputStream(path);
		String string="防投工.作不可放松！";
		//马入
		 fout.write(string.getBytes());
		//关闭
		fout.close();
	}
}
