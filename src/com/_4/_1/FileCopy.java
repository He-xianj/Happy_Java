package com._4._1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * */
public class FileCopy {

	public static void main(String[] args) {
		System.out.println("请输入需要复制的文件：（路径/文件）");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		try {
			
			FileReader fr=new FileReader(a);
			char[] temp=new char[20];
//			System.out.println(Arrays.toString(temp));
			System.out.println("请输入需要到复制的文件：（路径/文件）");
			String b=sc.next();
			sc.close();
			FileWriter fw=new FileWriter(b);
			fr.read(temp);
			fw.write(temp);
			System.out.println("复制成功！");
			fw.close();
			fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("文件不存在");
		}catch (IOException e) {	
			e.printStackTrace();	
		}finally {
			System.out.println("结束");
		}
		
	}

}
