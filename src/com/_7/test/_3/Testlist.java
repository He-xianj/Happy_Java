package com._7.test._3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * <p>(1)����10��1��100֮����������(�����ظ�)������һ��List����</p>
 * <p>(2)��д������List���Ͻ�������</p>
 * <p>(3)Ȼ�����õ�������������Ԫ�ز����</p>
*/
public class Testlist {

	public static void main(String[] args) {
		//����10��1��100֮����������(�����ظ�)������һ��List����
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			int b=(int)(Math.random()*100);
			for(;l.indexOf(b)==-1;) {
				l.add(i,b);
			}
		}	
		System.out.println(l.toString());
		//����
		l=ar(l);
		System.out.println(l.toString());
		//Ȼ�����õ�������������Ԫ�ز����
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	/**��д������List���Ͻ�������*/
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
