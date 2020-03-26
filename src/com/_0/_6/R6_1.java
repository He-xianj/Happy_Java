package com._0._6;
/**运行界面：测试用例为3、4、5和7、8、9*/
public class R6_1 {
	public static void main(String[] args) {
		//测试
		R6 test1=new R6();//测试用例3、4、5
		test1.setA(3);
		test1.setB(4);
		test1.setB(5);
		System.out.println(test1.area());
		System.out.println(test1.perimeter());
		R6 test2=new R6();//测试用例7、8、9
		test2.setA(7);
		test2.setB(8);
		test2.setC(9);
//System.out.println(test2.area());这个三角形求面积需要用到开根号，我不懂怎么开根号
		System.out.println(test2.perimeter());
	}
}

