package com.frist_semester._4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0;
		for (int i = 101; i <= 200; i++) {
			if (testIsPrime3(i)) {
				System.out.print(i + "\t");
				b++;
				if (b % 10 == 0) {
					System.out.println("\n");
				}

			}
		}
	}

//百度的质数
	public static boolean testIsPrime3(int n) {
		if (n <= 3) {
			return n > 1;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
