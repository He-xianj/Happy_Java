package com._2.test._1;
/**
 * ����һ���ӿڣ����а���һ��display()����������ʾ��Ϣ��֪ͨ�ࡢ�����ࡢ�����Ҫʵ�ָýӿڣ�
 * ����ʾ��֪ͨ���ݡ������������������������Ϣ����
 * �Ա��ʵ���ֲ��������ơ������Ķ����ýӿ����ã�
 * ��ͨ���ӿ����ñ���ִ��display��)������
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
