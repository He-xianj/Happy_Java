package com._5._1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Moved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("源文件名（带路径）：");
		//D:\hxj\Desktop\新建文本文档 (2).txt
	    String a = scan.next();
	    scan.close();
	    Moved m1=new Moved();
	    m1.remove(a);
	}
	public void remove(String strF) {
		FileReader rfr;
		try {
			rfr = new FileReader(strF);
			BufferedReader fr=new BufferedReader(rfr);
			StringBuffer sw=new StringBuffer();
			while(true) {
				String line=fr.readLine();
				
				if(line==null) {
					break;
				}else {
					if(!line.trim().startsWith("//")) {
						sw.append(line).append("\r\n");
					}
				}
			}
			FileWriter fw=new FileWriter(strF);
			PrintWriter pw=new PrintWriter(fw);
			pw.write(sw.toString());
			fr.close();
			pw.close();
			System.out.println("成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
