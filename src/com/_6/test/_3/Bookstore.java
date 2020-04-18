package com._6.test._3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 3��дһ��ͼ���࣬
 *    ͼ�������԰�������������š����ߡ��۸񡢳���������ԣ�
 *    �������۵ȷ�����ʵ����һ��ͼ�飬
 *    ��ͼ�����д���ļ��б��档
 * */
public class Bookstore {
	public static void main(String[] args) {
		Book b1=new Book("�ߵ���ѧ",1234567,"С��",48,"������ѧ");
		Book b2=new Book("test",4678546,"��",67.0,"���������");
		Book b3=new Book();
		b3.setAuthor("���Ͻ�");
		b3.setName("�����");
		b3.setISBN(10086);
		b3.setPress("���׳�����");
		b3.setPrices(186);
		b3.discount(0.5);
		Book[] b= {b1,b2,b3};
		try {
			FileOutputStream fo=new FileOutputStream("D:\\Book.txt");
			ObjectOutputStream Op=new ObjectOutputStream(fo);
			Op.writeObject(b);
			Op.close();
			FileInputStream fs=new FileInputStream("D:\\\\Book.txt");
			ObjectInputStream Op1=new ObjectInputStream(fs);
			Book[] t=(Book[])Op1.readObject();
			Op1.close();
			for(Book i:t) {
				System.out.println(i.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
