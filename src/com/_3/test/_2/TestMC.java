package com._3.test._2;
import java.util.*;
/**
 * 编程成绩统计程序，要求运行时提示输入逗号分隔的一系列成绩分数值，然后对这些分数按升序进行排序。
 * （完成程序填空）
 * */
public class TestMC {
	public static void main(String[] args) {
		try{
			System.out.println("====成绩统计====");
			Scanner scanner = new Scanner(System.in);
			Scanner scan=scanner.useDelimiter("\r\n");
			scanner.close();
//扫描器对象扫描的内容以回车换行作为分隔符，排除默认的空格，因而允许扫描内容包含空格
			System.out.println("请输入要计算的一系列数据(逗号分隔):");
			String str=scan.next();  //输入一行，如1，2，3，5，6，4
			String[] strArray=str.split(",");
			double[] doubleArray=new double[strArray.length];
			for(int i=0;i<strArray.length;i++){
				doubleArray[i]=Double.parseDouble(strArray[i]);//将字符串数组转换为double型数组
			}
			Arrays.sort(doubleArray);//数组排序
			System.out.println("按升序排序后的数据："+Arrays.toString(doubleArray));
			 
		}
		catch(Exception e){
			System.out.println("异常："+e.getMessage());
		}
	}
}