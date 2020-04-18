package com._6.test._2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWr {

	public static void main(String[] args) {
		ReadWr q1=new ReadWr();
		q1.read("D:\\春江花月夜.txt");
		q1.writer("D:\\春江花月夜的评价.txt");		
	}
	public  void read(String f){
		String line=null;
		try {
			FileReader fr1 = new FileReader(f);
			BufferedReader fr = new BufferedReader(fr1);	
			try {
				while((line=fr.readLine())!=null){
					System.out.println(line);
				}
				fr1.close();
				fr.close();
				System.out.println("请评价");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
	}
	public  void writer(String f) {
		String line=null;
		try {
			FileWriter fw=new  FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);		
			Scanner sc=new Scanner(System.in);
			line=sc.next();
			sc.close();
			pw.println(line);
				fw.close();
				pw.close();
				System.out.println("评价完成");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}
}
