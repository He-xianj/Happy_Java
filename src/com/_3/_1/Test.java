package com._3._1;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;
/**
 * ��1�����һ����n���ķ��������Ϊһ������������дһ������Ӽ�������һ��������
 * ��K��ֵ��Ȼ�������n!�ķ�����K�����ڳ����й滮���������쳣�����
 * �� �����������һ������������ʵ�����򲻼��㡣
 * �� �����������һ��ʮ�����Ʊ�ʾ�Ĵ�����ת��Ϊʮ���������ٽ��м��㡣
 * ��ʾ��ͨ��Integer.parseInt(String,16�������ɽ�����ʮ������ʶ��ת��Ϊʮ���ơ�
 * ������˼·���ж��������������0X��ʼ�����ʾΪʮ���������ݣ��ڽ�ʮ����
 * ת��Ϊʮ��������ʱҪȥ��0X��
 * ��ʣ�ಿ����ȡ Integer���parseInt(String,16������ת��ʮ����������
 * */
public class Test {
	public static void main(String[] args) {
		long k=0;
//		long kn=1;
		String c = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("��k��(0<n<20)��k=");
		try {
			k=sc.nextInt();
//			��K��ֵ
//			kn=hLongK(k);
//			������n!�ķ�����K��
//			System.out.println(kn);
			System.out.println(hLongKn(k));
			sc.close();
		}catch(InputMismatchException e) {
			try {
				c=sc.next();
//				kn=hLongK(c);
				System.out.println(hLongKn(c));
				sc.close();
			}catch(NumberFormatException ex) {
				System.out.println("��������ȷ����ֵ");
			}
		}
	}
	public static long hLongKn(long k) {
		long kn=1;
		if(k<=0) {
			System.out.println("������������");
			kn=0;
		}else {
			for(long v = 1;v<=k;v++) {		
				kn=v*kn;
			}
		}
		return kn;
	}
	public static long hLongKn(String c) {
		long kn=1;
		long k=0;
		if(c.charAt(0)=='0'&(c.charAt(1)=='X'|c.charAt(1)=='x')) {
			String c1=(String) c.subSequence(2, c.length());
			k=(long)Integer.parseInt(c1, 16);//ת��
			System.out.println("��k="+k);
			for(long v = 1;v<=k;v++) {		
				kn=v*kn;
		    }
		}else {
			k=Integer.parseInt(c, 16);//ת��
			System.out.println("��k="+k);
			for(long v = 1;v<=k;v++) {		
				kn=v*kn;
		    }
		}
		return kn;
	}
}
