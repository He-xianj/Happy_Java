package com._7.test._3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * <p>(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合</p>
 * <p>(2)编写方法对List集合进行排序</p>
 * <p>(3)然后利用迭代器遍历集合元素并输出</p>
*/
public class Testlist {

	public static void main(String[] args) {
		//生成10个1至100之间的随机整数(不能重复)，存入一个List集合
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			int b=(int)(Math.random()*100);
			for(;l.indexOf(b)==-1;) {
				l.add(i,b);
			}
		}	
		System.out.println(l.toString());
		//排数
		l=ar(l);
		System.out.println(l.toString());
		//然后利用迭代器遍历集合元素并输出
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	/**编写方法对List集合进行排序*/
	public static List<Integer> ar(List<Integer> t){
		int temp=0;
		for(int i=0;i<t.size()-1;i++) {	
			for(int j=0;j<t.size()-1;j++) {
				if((int)t.get(j)>(int)t.get(j+1)) {
					temp=(int)t.get(j);
					t.set(j,t.get(j+1) );
					t.set(j+1, temp);
				}
			}
		}
		return t;
	}
	
}
