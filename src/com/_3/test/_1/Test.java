package com._3.test._1;
import java.util.Scanner;
/**
 * 1��	�ö���,�������������ε������ߣ���������ε�����������ʾ
 * ��Scanner�ࡢString�ࡢDouble�ࡢMath�ࡢSystem�ࣩ��
 * <li>A������һ������   3.5��4.2��5.6  //Scanner ���ʵ�������󣬽����ַ�����
 *    ��������ַ�����ֵ��ĳ��String���͵ı���
 *<li> B�����ַ��������ա������ָ��Ϊ3�ݣ�����С���ַ���  3.5 4.2 5.6
 * <li>C����������ַ���ת����double����
 * <li>D��ʹ��Math��ķ��������м��㣬�õ����ս��
 * <li>E��������
 * */
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ε�������,���ö��ţ���������,����3��4��5");
//		����ַ�����ֵ��ĳ��String���͵ı���
		String three=sc.next();
		sc.close();
			if(three.indexOf(",")==1) {
//				���ַ��������ա������ָ��Ϊ3�ݣ�����С���ַ���
				String[] str_t=three.split(",");
				double[] dou_t=new double[3];
				for(int c=0;c<=2;c++) {
//					��������ַ���ת����double����
					dou_t[c]=Double.parseDouble(str_t[c]);
				}
				Triangle t1=new Triangle(dou_t[0],dou_t[1],dou_t[2]);
				System.out.println(t1.mathArea());
			}else if(three.indexOf("��")==1) {
//				���ַ��������ա������ָ��Ϊ3�ݣ�����С���ַ���
				String[] str_t=three.split("��");
				double[] dou_t=new double[3];
				for(int c=0;c<=2;c++) {
//					��������ַ���ת����double����
					dou_t[c]=Double.parseDouble(str_t[c]);
				}
				Triangle t1=new Triangle(dou_t[0],dou_t[1],dou_t[2]);
				System.out.println(t1.mathArea());
			}else {
				System.out.println("���������ߵĸ�ʽ����ȷ");
			}
	}
}
