package com._2.test._1;
/**
 * 定义一个接口，其中包含一个display()方法用于显示信息；通知类、汽车类、广类均要实现该接口，
 * 以显示“通知内容”、“汽车油量”、“广告消息”。
 * 试编程实现手测试类的设计。创建的对象用接口引用，
 * 并通过接口引用变量执行display（)方法。
 * */
public class Test {
	public static void main(String[] args) {
		Imformation i=new Imformation();
		i.display();
		Car c=new Car();
		c.display();
		Advertising a=new Advertising();
		a.display();
		Show s1=i;
		Show s2=c;
		Show s3=a;
		s1.display();
		s2.display();
		s3.display();
	}

}
