package com._4._2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class A {
	public static void main(String[] args) {
		File[] f=new File[args.length];
		char bg[][]=new char[args.length][];
		FileReader[] fr=new FileReader[args.length];
		try {
			for(int b=0;b<args.length;b++) {	
				f[b]=new File(args[b]);
				bg[b]=new char[(int) f[b].length()];
				fr[b]=new FileReader(f[b]);
				fr[b].read(bg[b]);
				int a=0;
				for(int v=0;v<bg[b].length;v++) {
					if(bg[b][v]=='a'||bg[b][v]=='A')
						a++;	
				}
				fr[b].close();
				System.out.println(args[b]+"一共有"+a+"个A(a)");	
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("异常");
			e.printStackTrace();
		}
	}

}
