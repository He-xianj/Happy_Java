package com._9.test._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**3��
 * ����������list�У�ͳ��ÿ���������ֵĴ�������������Ϊ����������Ϊֵ���浽map�У�Ԥ�Ȳ�֪������Щ�ˣ�
 * 1����Ԥ���ڳ����ж���ã�10�ˣ�
 * 2�����Ӽ������루��������̫�٣�10��
 * 3�������ļ��л�ȡ����
 * List  ArrayList
 * ѭ������List ���map
 * Map 
 * ���û���������
 * ��������ϣ�����Ϊ1��
 * ������������
 * ȡ������������+1��
 *  ����Map
*/
public class Ttest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name={"������","�ߴ�ɽ","л��","�����","��ç","л��","�º���","������","�ߴ�ɽ","̷ƽɽ"};
		ArrayList<String> l=new Ttest1().lToString(name);
		new Ttest1().nuber(l);
	}
	public ArrayList<String> lToString(String[] s){
		ArrayList<String> l=new ArrayList<String>();
		for(String na:s) {
			l.add(na);
		}
		Iterator<String> i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		return l;
	}
	public Map<String,Integer> nuber(ArrayList<String> l){
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(int p1=0;p1<l.size();p1++) {
			if(m.containsKey(l.get(p1))) {
				m.put(l.get(p1), m.get(l.get(p1))+1);
			}else {
				m.put(l.get(p1), 1);
			}
		}
		System.out.println(m.toString());
		return m;
	}
}
