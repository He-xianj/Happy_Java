package com.frist_semester._4;

public class HanXinDianBing {
	/**
	 * ���ŵ����������ˡ�����һ�ж�һ�ˣ�����һ���ٶ��ˣ�����һ�иոպá����ж����ˡ�
	 */
	public static void main(String[] args) {
		for (int bing = 0;bing < 100;bing++) {
			if(bing % 3 == 1 & bing % 7 == 5 & bing % 5 == 0) {
				System.out.print("������"+bing+"��ʿ��-");
				break;
			}
		}
	}
}
