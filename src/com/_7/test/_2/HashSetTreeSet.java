package com._7.test._2;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSet {

	public static void main(String[] args) {
		HashSet<Integer> s1=new HashSet<Integer>();
		s1.add(4);
		s1.add(8);
		s1.add(6);
		System.out.println(s1.toString());
		s1.add(4);
		System.out.println(s1.toString());
		TreeSet<String> s2=new TreeSet<String>();
		s2.add("��");
		s2.add("��");
		s2.add("��Ҫ");
		s2.add("��");
		s2.add("��");
		s2.add("õ��");
		s2.add("��");
		System.out.println(s2.toString());
	}

}
