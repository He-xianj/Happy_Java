package com._5._1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Removet {
	public static void main(String[] args) {
		BufferedReader fr = null;
		try {
			fr = new BufferedReader(new FileReader("D:\\´º½­»¨ÔÂÒ¹.txt"));
			String line=null;
			try {
				while((line=fr.readLine())!=null){
				System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
