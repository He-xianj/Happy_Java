package com._0._6;
/**���н��棺��������Ϊ3��4��5��7��8��9*/
public class R6_1 {
	public static void main(String[] args) {
		//����
		R6 test1=new R6();//��������3��4��5
		test1.setA(3);
		test1.setB(4);
		test1.setB(5);
		System.out.println(test1.area());
		System.out.println(test1.perimeter());
		R6 test2=new R6();//��������7��8��9
		test2.setA(7);
		test2.setB(8);
		test2.setC(9);
//System.out.println(test2.area());����������������Ҫ�õ������ţ��Ҳ�����ô������
		System.out.println(test2.perimeter());
	}
}

