package com._5.test._1;

import java.io.File;
import java.io.IOException;

/**
 * 3、	File类的运用
 * */
public class Filetest {
	public static void main(String[] args) {
		File f=new File("D:\\test.txt")	;
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("文件大小"+f.length());
				System.out.println("文件可读"+f.canRead());
				System.out.println("文件可写"+f.canWrite());
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
