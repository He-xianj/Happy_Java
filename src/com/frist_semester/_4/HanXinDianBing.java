package com.frist_semester._4;

public class HanXinDianBing {
	/**
	 * 韩信点兵，不足百人。三人一行多一人，七人一行少二人，五人一行刚刚好。问有多少人。
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
				System.out.println("韩信有" + bing + "个士兵");
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
				System.out.println("韩信有" + bing + "个士兵");
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
				System.out.print("韩信有" + bing + "个士兵");
				break;
			}
		} while (bing < 100);
	}

}
