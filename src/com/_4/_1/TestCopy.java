package com._4._1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 失败品
 * */
public class TestCopy {

	public static void main(String[] args) {
		System.out.println("请输入需要复制的文件：（路径/文件）");
		Scanner sc=new Scanner(System.in);
		File f1=new File(sc.next());
		char[] temp=new char[(int) f1.length()];
		System.out.println("请输入需要到复制的文件：（路径/文件）");
		File f2=new File(sc.next());
		sc.close();
		try {
			FileReader fr=new FileReader(f1);
			
			try {
				fr.read(temp);
				System.out.println(Arrays.toString(temp));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在");
			e.printStackTrace();
		}
		try {
			FileWriter fw=new FileWriter(f2);
			fw.write("不知道");
			fw.close();
			
		} catch (IOException e) {
			System.out.println("文件不存在");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
