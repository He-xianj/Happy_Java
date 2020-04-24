package com._7.test._4;

import java.util.ArrayList;
import com._6.test._3.Book;
/**
 * 编写一个类Book，
 * 具有name,price,press,author 
 * 然后创建5个对象放入ArrayList中，
 * 并实现按照price大小排序，
 * 然后遍历ArrayList输出每个Book对象,
 *  使用toString 方法打印。
 *  */
public class Bookprice {

	public static void main(String[] args) {
		//创建5个对象放入ArrayList中
		Book b1=new Book("高等数学",1234567,"小米",48,"北京大学");
		Book b2=new Book("test",4678546,"按",67.0,"人民出版社");
		Book b3=new Book("Thinking In Java",4678546,"Bruce Eckel",89,"机械工业出版社 ");
		Book b4=new Book("Java程序设计",302463221,"赖小平",58,"机械工业出版社 ");
		Book b5=new Book("十宗罪5",540471682,"Bruce Eckel",35,"湖南文艺出版社 ");
		ArrayList<Book> l=new ArrayList<Book>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		
		System.out.println(l.toString());
//		排序
		l=ar(l);
//		使用toString 方法打印
		System.out.println(l.toString());
	}
	
	public static ArrayList<Book> ar(ArrayList<Book> t){
		Book temp=null;
		for(int i=0;i<t.size()-1;i++) {	
			for(int j=0;j<t.size()-1;j++) {
//				按照price大小排序
				if(t.get(j).getPrices()>t.get(j+1).getPrices()) {
					temp=t.get(j);
					t.set(j,t.get(j+1) );
					t.set(j+1, temp);
				}
			}
		}
		return t;
	}
}
