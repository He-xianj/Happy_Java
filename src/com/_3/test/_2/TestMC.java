package com._3.test._2;
import java.util.*;
/**
 * ��̳ɼ�ͳ�Ƴ���Ҫ������ʱ��ʾ���붺�ŷָ���һϵ�гɼ�����ֵ��Ȼ�����Щ�����������������
 * ����ɳ�����գ�
 * */
public class TestMC {
	public static void main(String[] args) {
		try{
			System.out.println("====�ɼ�ͳ��====");
			Scanner scanner = new Scanner(System.in);
			Scanner scan=scanner.useDelimiter("\r\n");
			scanner.close();
//ɨ��������ɨ��������Իس�������Ϊ�ָ������ų�Ĭ�ϵĿո��������ɨ�����ݰ����ո�
			System.out.println("������Ҫ�����һϵ������(���ŷָ�):");
			String str=scan.next();  //����һ�У���1��2��3��5��6��4
			String[] strArray=str.split(",");
			double[] doubleArray=new double[strArray.length];
			for(int i=0;i<strArray.length;i++){
				doubleArray[i]=Double.parseDouble(strArray[i]);//���ַ�������ת��Ϊdouble������
			}
			Arrays.sort(doubleArray);//��������
			System.out.println("���������������ݣ�"+Arrays.toString(doubleArray));
			 
		}
		catch(Exception e){
			System.out.println("�쳣��"+e.getMessage());
		}
	}
}