package com._0._3;
/**
 * 1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
 * �����ʽ:����С�����˳�����������������λʮ��������
 * */
public class R3 {
	public static void main(String[] args) {
		for(int mirror=10,a=0,b=0,c=0;mirror<=99;mirror++) {
			a=mirror%10;
			//ȡ��λ
			b=mirror/10;
			//ȡʮλ	
			c=mirror*100+a*10+b;
			//������1221����������
			if((mirror-9)%10==0) {
//Ϊ�˷���鿴ʮ��Ϊһ��
				System.out.print(c+"\n");
			}else {
				System.out.print(c+" ");
				//��˳�����������������λʮ��������
			}
		}
	}
}

