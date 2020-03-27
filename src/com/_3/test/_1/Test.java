package com._3.test._1;
import java.util.Scanner;
/**
 * 1、	用逗号,隔开输入三角形的三条边，求出三角形的面积并输出显示
 * （Scanner类、String类、Double类、Math类、System类）。
 * <li>A、输入一串数字   3.5，4.2，5.6  //Scanner 类的实力化对象，接收字符串，
 *    并把这个字符串赋值给某个String类型的变量
 *<li> B、把字符串，按照“，”分割成为3份，三个小的字符串  3.5 4.2 5.6
 * <li>C、把上面的字符串转换成double类型
 * <li>D、使用Math类的方法，进行计算，得到最终结果
 * <li>E、输出结果
 * */
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入三角形的三条边,并用逗号（，）隔开,例：3，4，5");
//		这个字符串赋值给某个String类型的变量
		String three=sc.next();
		sc.close();
			if(three.indexOf(",")==1) {
//				把字符串，按照“，”分割成为3份，三个小的字符串
				String[] str_t=three.split(",");
				double[] dou_t=new double[3];
				for(int c=0;c<=2;c++) {
//					把上面的字符串转换成double类型
					dou_t[c]=Double.parseDouble(str_t[c]);
				}
				Triangle t1=new Triangle(dou_t[0],dou_t[1],dou_t[2]);
				System.out.println(t1.mathArea());
			}else if(three.indexOf("，")==1) {
//				把字符串，按照“，”分割成为3份，三个小的字符串
				String[] str_t=three.split("，");
				double[] dou_t=new double[3];
				for(int c=0;c<=2;c++) {
//					把上面的字符串转换成double类型
					dou_t[c]=Double.parseDouble(str_t[c]);
				}
				Triangle t1=new Triangle(dou_t[0],dou_t[1],dou_t[2]);
				System.out.println(t1.mathArea());
			}else {
				System.out.println("输入三条边的格式不正确");
			}
	}
}
