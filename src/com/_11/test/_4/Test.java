package com._11.test._4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortoise t=new Tortoise();
		Rabbit r=new Rabbit();
		Thread t1=new Thread(t);
		Thread t2=new Thread(r);
		System.out.println("------------------�������ܿ�ʼ----------------");
		t1.start();
		t2.start();
		while(true) {
			if(t.state==0) {
				System.out.println("�ڹ��ȵ����յ�");
				System.out.println("�������������������ڹ�ʤ��������������������������������");
				t2.interrupt();
				break;
			}else if(r.state==0) {
				System.out.println("�����ȵ����յ�");
				System.out.println("����������������������ʤ��������������������������������");
				t1.interrupt();
				break;
			}else {
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
