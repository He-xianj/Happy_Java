package com._5.test._1;

import java.io.File;
import java.io.IOException;

/**
 * 3��	File�������
 * */
public class Filetest {
	public static void main(String[] args) {
		File f=new File("D:\\test.txt")	;
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("�ļ���С"+f.length());
				System.out.println("�ļ��ɶ�"+f.canRead());
				System.out.println("�ļ���д"+f.canWrite());
			}else if(f.isDirectory()) {
				String[] str=f.list();
				for(String a:str) {
					System.out.println(a);
					try {
						f.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		 }
	}

}
