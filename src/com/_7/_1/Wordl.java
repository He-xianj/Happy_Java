package com._7._1;

import java.util.Arrays;
import java.util.HashMap;

/**<p>使用HashMap，统计一个英语句子，每个英文单词出现的次数，并输出。
 * <p>例如：Where there is a will there is a way
 * <p>输出结果
 * <p>Where=1
 * <p>there=2
 * <p>is=2		
 * <p>a=2
 * <p>will=1
 * <p>way=1
*/
public class Wordl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		m=new Wordl().mo("Where there is a will there is a way.");
		System.out.println(m.toString());
	}
	/**统计一个英语句子，每个英文单词出现的次数，并输出*/
	public HashMap<String,Integer> mo(String a){
//		将单词分开
		a=a.replace('.', ' ');
		a=a.replace(',', ' ');
		a=a.replace('.', ' ');
		a=a.replace('?', ' ');
		a=a.replace('!', ' ');
		String[] b=a.split(" ");
		HashMap<String,Integer> m=new HashMap<String,Integer>();
//		将单词放入m里
		for(int i=0;i<=b.length-1;i++) {
			if(m.containsKey(b[i])) {
//				这个单词已经存在加1
				m.put(b[i], m.get(b[i])+1);
			}else {
//				没有放入
				m.put(b[i],1);
			}
		}
		return m;
	}
}
