package com.frist_semester._4;

public class HanXinDianBing {
	/**
	 * ���ŵ����������ˡ�����һ�ж�һ�ˣ�����һ���ٶ��ˣ�����һ�иոպá����ж����ˡ�
	 */
	public static void main(String[] args) {
		forBing();
		whileBing();
		do_whileBing();
	}

	/**
	 * for
	 */
	public static void forBing() {
		for (int bing = 0; bing < 100; bing++) {
			if (bing % 3 == 1 & bing % 7 == 5 & bing % 5 == 0) {
				System.out.println("������" + bing + "��ʿ��");
				break;
			}
		}
	}

	/**
	 * while
	 */
	public static void whileBing() {
		int bing = 0;
		while (bing < 100) {
			bing++;
			if (bing % 3 == 1 & bing % 7 == 5 & bing % 5 == 0) {
				System.out.println("������" + bing + "��ʿ��");
				break;
			}
		}
	}

	/**
	 * do-while
	 */
	public static void do_whileBing() {
		int bing = 0;
		do {
			bing++;
			if (bing % 3 == 1 & bing % 7 == 5 & bing % 5 == 0) {
				System.out.print("������" + bing + "��ʿ��");
				break;
			}
		} while (bing < 100);
	}

}
