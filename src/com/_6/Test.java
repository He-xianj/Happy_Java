package com._6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class Test {
	public static void main(String[] args) {
		Student s1=new Student(7,"张三",18,"男");
		Student s2=new Student(553,"李华",19,"男");
		Student s3=new Student(89,"李四",18,"女");
		LinkedList<Student> l=new LinkedList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		traveres(l);
		l.add(new Student(857,"狃彼",18,"男"));
		traveres(l);
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getsId()==857) 
				l.remove(i);
		
		}
		System.out.println("已删去");
		traveres(l);
		ArrayList<Object> c=new ArrayList<Object>();
		s1.setMatchachievement(99);
		s2.setMatchachievement(89);
		s3.setMatchachievement(87);
		Student s4=new Student(777,"张起灵",288,"男");
		s4.setMatchachievement(100);
		Student s5=new Student(99,"吴邪",20,"男");
		s5.setMatchachievement(70);
		c.add(s1.getMatchachievement());
		c.add(s2.getMatchachievement());
		c.add(s3.getMatchachievement());
		c.add(s4.getMatchachievement());
		c.add(s5.getMatchachievement());
		int temp=0;
		int average=0;
		for(int i=0;i<c.size()-1;i++) {	
			for(int j=0;j<c.size()-1;j++) {
				if((int)c.get(j)>(int)c.get(j+1)) {
					temp=(int)c.get(j);
				}
			}
		}
		System.out.println("最高分"+temp);
		for(int i=0;i<c.size();i++) {
			average=average+(int)c.get(i);
		}
		average=average/c.size();
		System.out.println("平均分"+average);
		Map<Integer, String> myMap=new HashMap<Integer, String>();
		myMap.put(7, "张三");
		myMap.put(553, "李华");
		myMap.put(89, "李四");
		myMap.put(857, "狃彼");
		myMap.put(777, "张起灵");
		myMap.put(99, "吴邪");
		System.out.println(myMap.get(857));
		System.out.println("-------------------------");
		int[] sid= {7,553,89,857,777,99,};
		Arrays.sort(sid);
		for(int i:sid) {
			System.out.println(myMap.get(i));
		}
	}
	public static void traveres(LinkedList<Student> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("所有学生展示完毕");
	}
}
