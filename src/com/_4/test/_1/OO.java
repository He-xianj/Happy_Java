package com._4.test._1;
/**
 * 1��	�����쳣����ʾ��
 * A��	�����쳣 -1/0
 * B��	����Խ���쳣
 * C��	��ָ���쳣
 * */
public class OO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(-1/0);
		}catch(ArithmeticException e) {
			System.out.println("�����쳣");
		}
		
	}

}
