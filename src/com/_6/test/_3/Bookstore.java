package com._6.test._3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 3、写一个图书类，
 *    图书类属性包括：书名、书号、作者、价格、出版社等属性，
 *    包含打折等方法。实例化一组图书，
 *    将图书对象写进文件中保存。
 * */
public class Bookstore {
	public static void main(String[] args) {
		Book b1=new Book("高等数学",1234567,"小米",48,"北京大学");
		Book b2=new Book("test",4678546,"按",67.0,"人民出版社");
		Book b3=new Book();
		b3.setAuthor("铝合金");
		b3.setName("纪念册");
		b3.setISBN(10086);
		b3.setPress("厘米出版社");
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
