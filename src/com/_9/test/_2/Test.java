package com._9.test._2;

import java.util.HashMap;
import java.util.Map;

/**
 * (2)����Map���ϣ���Student������Ϊkey�����ַ���(�˱�ʾ��ʾѧ����סַ)��Ϊvalue
 * (3)������Map�����е����ݣ���ʽ��key--value
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, String> m=new HashMap<Student, String>();
		m.put(new Student("С��",19), "�㶫ʡ");
		m.put(new Student("С��",21), "�Ĵ�");
		m.put(new Student("С��",78), "����");
		for (Student o:m.keySet()) {
			System.out.println(o.toString()+"--"+m.get(o));
		}
	}

}
