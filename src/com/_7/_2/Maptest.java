package com._7._2;

import java.util.HashMap;
import java.util.Map;
/**
 * Ҫ��
 * <p>1.�������ϣ�����������Ӧ������ӡ��
 * <p>2.���map�����в���һ������Ϊ5����Ϊ���������Ϣ
 * <p>3.�Ƴ���map�еı��Ϊ1����Ϣ
 * <p>4.��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"
 * */
public class Maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "������");
		map.put(2, "������");
		map.put(3, "����");
		map.put(4, "���ʦ̫");
//		�������ϣ�����������Ӧ������ӡ��
		System.out.println(map.toString());
//		���map�����в���һ������Ϊ5����Ϊ���������Ϣ
		map.put(5, "������");
//		�Ƴ���map�еı��Ϊ1����Ϣ
		map.remove(1);
//		��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"
		map.put(2, "����");
		System.out.println(map.toString());
	}

}
