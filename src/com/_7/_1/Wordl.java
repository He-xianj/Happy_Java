package com._7._1;

import java.util.Arrays;
import java.util.HashMap;

/**<p>ʹ��HashMap��ͳ��һ��Ӣ����ӣ�ÿ��Ӣ�ĵ��ʳ��ֵĴ������������
 * <p>���磺Where there is a will there is a way
 * <p>������
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
	/**ͳ��һ��Ӣ����ӣ�ÿ��Ӣ�ĵ��ʳ��ֵĴ����������*/
	public HashMap<String,Integer> mo(String a){
//		�����ʷֿ�
		a=a.replace('.', ' ');
		a=a.replace(',', ' ');
		a=a.replace('.', ' ');
		a=a.replace('?', ' ');
		a=a.replace('!', ' ');
		String[] b=a.split(" ");
		HashMap<String,Integer> m=new HashMap<String,Integer>();
//		�����ʷ���m��
		for(int i=0;i<=b.length-1;i++) {
			if(m.containsKey(b[i])) {
//				��������Ѿ����ڼ�1
				m.put(b[i], m.get(b[i])+1);
			}else {
//				û�з���
				m.put(b[i],1);
			}
		}
		return m;
	}
}
