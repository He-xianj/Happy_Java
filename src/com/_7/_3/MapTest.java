package com._7._3;

import java.util.HashMap;
import java.util.Map;

/**��2�����飬��һ����������Ϊ��[������ʡ,�㽭ʡ,����ʡ,�㶫ʡ,����ʡ]��
 * �ڶ�������Ϊ��[������,����,�ϲ�,����,����]��
 * ����һ������Ԫ����Ϊkey��
 * �ڶ�������Ԫ����Ϊvalue�洢��Map�����С�
 * ��{������ʡ=������, �㽭ʡ=����, ��}��
 * */
public class MapTest {
	public static void main(String[] args) {
		// ��һ������
		String[] province= {"������ʡ","�㽭ʡ","����ʡ","�㶫ʡ","����ʡ"};
		//�ڶ�������
		String[] provinces= {"������","����","�ϲ�","����","����"};
		Map<String,String> map=new HashMap<String,String>();
		//����һ������Ԫ����Ϊkey���ڶ�������Ԫ����Ϊvalue�洢��Map�����С�
		for(int i=0;i<provinces.length;i++) 
			map.put(province[i], provinces[i]);
		System.out.println(map.toString());
	}
}
