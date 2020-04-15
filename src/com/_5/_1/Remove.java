package com._5._1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("源文件名（带路径）：");
	    String a = scan.next();
	    Remove y=new Remove();
	    try {
			y.rem(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    scan.close();
	   
	    //D:\hxj\Desktop\test.txt
	}
	public  void rem(String f) throws FileNotFoundException {
			String line=null;
			try {
				FileReader fr1 = new FileReader(f);
				BufferedReader fr = new BufferedReader(fr1);
				FileWriter fw=new  FileWriter(f);
				PrintWriter pw=new PrintWriter(fw);		
				try {
					while((line=fr.readLine())!=null){
						System.out.println("成功LLL");
						System.out.println(line);
						if(line.trim().startsWith("//")) {
							pw.println(line);
						}
					}
					fw.close();
					fr1.close();
					fr.close();
					pw.close();
					System.out.println("成功");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
}
