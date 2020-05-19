package com._9.test._2;

import java.util.HashMap;
import java.util.Map;

/**
 * (2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
 * (3)利遍历Map集合中的内容，格式：key--value
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, String> m=new HashMap<Student, String>();
		m.put(new Student("小红",19), "广东省");
		m.put(new Student("小白",21), "四川");
		m.put(new Student("小明",78), "北京");
		for (Student o:m.keySet()) {
			System.out.println(o.toString()+"--"+m.get(o));
		}
	}

}
