package com._3._2;
import java.util.Scanner;

/**
 *��2���Ӽ�������һ��ʮ��������������ת��Ϊʮ����������������Ĳ���һ����Լʮ�������������׳��쳣��
 *<li>������˼·��ʮ��������ֻ��0~9��A~F��a~f���ַ���
 *               ���Ƚ�ÿλ�ַ�ת��Ϊ��Ӧʮ���ƣ�
 *               Ȼ���ð�λ���Ի���16����ƴ��ת��Ϊʮ���ơ� 
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
