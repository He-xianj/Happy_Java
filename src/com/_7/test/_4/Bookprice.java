package com._7.test._4;

import java.util.ArrayList;
import com._6.test._3.Book;
/**
 * ��дһ����Book��
 * ����name,price,press,author 
 * Ȼ�󴴽�5���������ArrayList�У�
 * ��ʵ�ְ���price��С����
 * Ȼ�����ArrayList���ÿ��Book����,
 *  ʹ��toString ������ӡ��
 *  */
public class Bookprice {

	public static void main(String[] args) {
		//����5���������ArrayList��
		Book b1=new Book("�ߵ���ѧ",1234567,"С��",48,"������ѧ");
		Book b2=new Book("test",4678546,"��",67.0,"���������");
		Book b3=new Book("Thinking In Java",4678546,"Bruce Eckel",89,"��е��ҵ������ ");
		Book b4=new Book("Java�������",302463221,"��Сƽ",58,"��е��ҵ������ ");
		Book b5=new Book("ʮ����5",540471682,"Bruce Eckel",35,"�������ճ����� ");
		ArrayList<Book> l=new ArrayList<Book>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		
		System.out.println(l.toString());
//		����
		l=ar(l);
//		ʹ��toString ������ӡ
		System.out.println(l.toString());
	}
	
	public static ArrayList<Book> ar(ArrayList<Book> t){
		Book temp=null;
		for(int i=0;i<t.size()-1;i++) {	
			for(int j=0;j<t.size()-1;j++) {
//				����price��С����
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
