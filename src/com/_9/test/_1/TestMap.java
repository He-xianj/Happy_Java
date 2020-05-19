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
		//添加元素
		myMap.put("A",111);
		myMap.put("B",222);
		myMap.put(333,"C");
		myMap.put(333,"D");
		myMap.put(null,null);
		System.out.println(myMap.size());
		System.out.println(myMap);				
		myMap.remove("A");//删除元素
		System.out.println(myMap);			
		Object value = myMap.get("B");//获取指定key的value值
		System.out.println(value);
	}
}
