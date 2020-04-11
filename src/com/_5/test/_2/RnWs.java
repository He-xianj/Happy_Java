package com._5.test._2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RnWs {

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
		FileReader fr=new FileReader(path);
		char[] temp=new char[1024];
		fr.read(temp);
		System.out.println(new String(temp));
		fr.close();
	}
	public static void output(String path) throws IOException{
		FileWriter fw=new FileWriter(path);
		fw.write("ÄãºÃ°¡£¡");
		fw.close();
	}
}
