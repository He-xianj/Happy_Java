package com._9.test._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**3、
 * 在人名集合list中，统计每种人名出现的次数，将人名作为键，次数作为值，存到map中（预先不知道有哪些人）
 * 1）、预先在程序中定义好（10人）
 * 2）、从键盘输入（人名不能太少，10）
 * 3）、从文件中获取人名
 * List  ArrayList
 * 循环遍历List 添加map
 * Map 
 * 如果没有这个名字
 * 名字添加上，次数为1；
 * 如果有这个名字
 * 取出次数，次数+1；
 *  放入Map
*/
public class Ttest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name={"彭万里","高大山","谢大海","马宏宇","林莽","谢大海","章汉夫","范长江","高大山","谭平山"};
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
