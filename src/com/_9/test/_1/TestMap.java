package com._9.test._1;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		TestMap t=new TestMap();
		t.testMap1();
	}
	public void testMap1(){
		Map myMap = new HashMap();
		//���Ԫ��
		myMap.put("A",111);
		myMap.put("B",222);
		myMap.put(333,"C");
		myMap.put(333,"D");
		myMap.put(null,null);
		System.out.println(myMap.size());
		System.out.println(myMap);				
		myMap.remove("A");//ɾ��Ԫ��
		System.out.println(myMap);			
		Object value = myMap.get("B");//��ȡָ��key��valueֵ
		System.out.println(value);
	}
}
