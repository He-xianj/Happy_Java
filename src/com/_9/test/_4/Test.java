package com._9.test._4;

import java.util.HashMap;
/**��1������һ����Book�������ԣ�id����ţ���title��������ʹ�ù��췽�����г�ʼ����дtoString()����������title���Ե�ֵ
��2������һ����BookTest�������������ʹ��HashMap���д洢����ΪBook����ı�ţ�ֵΪBook����ͨ����Ż�ȡBook���󣬲���ӡ�����������
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b=new Book[3];
		b[0]=new Book(1,"ѧ���ֲ�");
		b[1]=new Book(2,"�ഺ�����ֲ�");
		b[2]=new Book(3,"�ߵ���ѧ");
		HashMap<Integer, Book> m=new HashMap<Integer, Book>();
		m.put(b[0].getId(),b[0]);
		m.put(b[1].getId(),b[1]);
		m.put(b[2].getId(),b[2]);
		System.out.println(m.get(2).getTitle());
		System.out.println(m.get(3).getTitle());
		System.out.println(m.get(1).getTitle());
	}

}
