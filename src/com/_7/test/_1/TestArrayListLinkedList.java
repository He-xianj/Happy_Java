package com._7.test._1;

import java.util.ArrayList;
import java.util.LinkedList;

/**1��	��ʾArrayList��LinkedList*/
public class TestArrayListLinkedList {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<String>();
		l1.add(0,"��һ����Ҫ�Ǻ�õ��");
		l1.add(1,"ֻ��ƣ��ʱ��������");
		l1.add(2,"����������");
		l1.add(3,"һֱһֱ��������");
		System.out.println(l1.toString());
		for(int i=0;i<4;i++) {
			System.out.println(l1.get(i));
		}
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(1);l2.add(4);l2.add(3);l2.add(3);
		l2.add(2);l2.add(2);l2.add(3);
		System.out.println(l2.size());
		System.out.println(l2.toString());
		l2.set(5, 9);
		l2.remove(4);
		System.out.println(l2.size());
		System.out.println(l2.toString());
	}

}
