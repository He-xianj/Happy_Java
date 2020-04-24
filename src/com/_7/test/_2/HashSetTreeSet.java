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
		s2.add("我");
		s2.add("不");
		s2.add("需要");
		s2.add("糖");
		s2.add("和");
		s2.add("玫瑰");
		s2.add("我");
		System.out.println(s2.toString());
	}

}
