package com._3._2;
import java.util.Scanner;

/**
 * 
 * */
public class HexadecimalToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t=scanner.next();//����
		scanner.close();
		try {
			int n=Integer.parseInt(t, 16);//ת��
			System.out.println(n);//���
		}catch(NumberFormatException e) {
			System.out.println("�쳣");//���
		}
	}

}
