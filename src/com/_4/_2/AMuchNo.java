package com._4._2;
/**
 * û����Ŀ
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class AMuchNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		try {
			System.out.println("��������Ҫ��A(a)�ļ�����·��/�ļ���");
			File f=new File(sc.next());
			char[] am =new char[(int) f.length()];
			FileReader fr=new FileReader(f);
			sc.close();
			fr.read(am);
			for(int v=0;v<am.length;v++) {
				if(am[v]=='a'||am[v]=='A')
					a++;	
			}
			fr.close();
			System.out.println("һ����"+a+"��A(a)");	
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�쳣");
			e.printStackTrace();
		}
	}

}
