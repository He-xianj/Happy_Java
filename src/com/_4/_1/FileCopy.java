package com._4._1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������Ҫ���Ƶ��ļ�����·��/�ļ���");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		try {
			
			FileReader fr=new FileReader(a);
			char[] temp=new char[20];
//			System.out.println(Arrays.toString(temp));
			System.out.println("��������Ҫ�����Ƶ��ļ�����·��/�ļ���");
			String b=sc.next();
			sc.close();
			FileWriter fw=new FileWriter(b);
			fr.read(temp);
			fw.write(temp);
			System.out.println("���Ƴɹ���");
			fw.close();
			fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("�ļ�������");
		}catch (IOException e) {	
			// TODO Auto-generated catch block	
			e.printStackTrace();	
		}finally {
			System.out.println("����");
		}
		
	}

}
