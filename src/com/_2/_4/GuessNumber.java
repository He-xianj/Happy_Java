package com._2._4;
import java.util.Scanner;
/**����С��Ϸ���������1-100�е�ĳ������t���Ӽ�������һ����n��
 * ����������n=t����ϲ�¶ԣ������һ���µ�m�β³ɹ���
 * ���n>t,��ʾ�������ݹ������n<t,��ʾ�������ݹ�С��
 * */
public class GuessNumber {
	static int a=(int)(Math.random()*100)+1;
	static int m=0;
	public static void main(String[] args) {
		System.out.println("�Ӽ�������һ����");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		guess(n);
		scanner.close();
	}
	public static  void guess(int g) {
		if(a==g) {
			System.out.println("��ϲ�¶�");
			System.out.println("һ���µ�"+(m+1)+"�β³ɹ�");
			return;
		}else if(a>g) {
			System.out.println("�������ݹ�С");
			m++;
			if(m==10) {
				System.out.println("����");
				return;
			}
			guess(new Scanner(System.in).nextInt());
		}else if(a<g) {
			System.out.println("�������ݹ���");
			m++;
			if(m==5) {
				System.out.println("����");
				return;
			}			
			guess(new Scanner(System.in).nextInt());
		}
	}
}
