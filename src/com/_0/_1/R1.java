package com._0._1;
import java.util.Scanner;
/**
 * 1��Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��
 *    �������һ������n
 *    ���һ�У�����һ����������ʾFn
 * */
public class R1 {
	public static void main(String[] args) {
		System.out.print("n=");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		//�������һ������n
		int fn=0;
		for(int a=1,b=0,d=1;d<=n;d++) {
			if(d==1) {
				continue;
				//ʹF1=F2=1
			}else {
				fn=a+b;
				//��Fn=Fn-1+Fn-2
				b=a;
				a=fn;
			}
		}
		System.out.println("f"+n+"="+fn);
		//���һ�У�����һ����������ʾFn
	}
}

