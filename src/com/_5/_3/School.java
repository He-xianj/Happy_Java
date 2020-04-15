package com._5._3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student("908");
		Student a1=new Student("vds");
		Student a2=new Student("90ef8");
		Student a3=new Student("90vv8");
		try {
			FileOutputStream fo = new FileOutputStream("D:\\hxj\\Desktop\\Student.txt");
			ObjectOutputStream Op=new ObjectOutputStream(fo);
			Op.writeObject(a);
			Op.writeObject(a1);
			Op.writeObject(a2);
			Op.writeObject(a3);
			Op.close();
			FileInputStream fs=new FileInputStream("D:\\hxj\\Desktop\\Student.txt");
			ObjectInputStream Op1=new ObjectInputStream(fs);
			Student t=(Student)Op1.readObject();
			Student t1=(Student)Op1.readObject();
			Student t2=(Student)Op1.readObject();
			Student t3=(Student)Op1.readObject();
			Op1.close();
			System.out.println(t.mane);
			System.out.println(t1.mane);
			System.out.println(t2.mane);
			System.out.println(t3.mane);
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
