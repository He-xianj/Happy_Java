package com._5._2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen=new Hero("garen");
		try {
			FileOutputStream fo = new FileOutputStream("D:\\hxj\\Desktop\\garen.lol");
			ObjectOutputStream Op=new ObjectOutputStream(fo);
			Op.writeObject(garen);
			Op.close();
			FileInputStream fs=new FileInputStream("D:\\hxj\\Desktop\\garen.lol");
			ObjectInputStream Op1=new ObjectInputStream(fs);
			Hero t=(Hero)Op1.readObject();
			Op1.close();
			System.out.println(t.mane);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
