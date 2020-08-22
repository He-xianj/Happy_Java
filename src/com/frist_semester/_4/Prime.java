package com.frist_semester._4;

/** 判断101到200之间有多少个素数，并输出所有素数！(每行输出10个素数) */
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
