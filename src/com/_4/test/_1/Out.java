package com._4.test._1;
/**
 * @see OO
 * */
public class Out {
	public static void main(String[] args) {
		try{
			int[] i= {1};
			System.out.println(i[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		}
	}
}
