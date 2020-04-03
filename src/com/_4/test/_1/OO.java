package com._4.test._1;
/**
 * 1、	几个异常的演示：
 * A、	算术异常 -1/0
 * B、	数组越界异常
 * C、	空指针异常
 * */
public class OO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(-1/0);
		}catch(ArithmeticException e) {
			System.out.println("算术异常");
		}
		
	}

}
