package com.frist_semester._4;

/** �ж�101��200֮���ж��ٸ����������������������(ÿ�����10������) */
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for(int p = 101;p <= 200;p++) {
			for(int i = 2;i <= Math.sqrt(p);i++) {
				if(p % i == 0) 
					continue;
//					if(n % 10 == 0)
//						System.out.println();
				
				
			}
			System.out.print(p +"\t");
			n++;
		}
	}

}
