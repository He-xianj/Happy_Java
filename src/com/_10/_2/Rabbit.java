package com._10._2;

public class Rabbit implements Runnable {
	int state=10;
	public Rabbit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;state>6;state-=2) {
			System.out.println("���ӻ���"+state+"��");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		try {
			System.out.println("..........����������Ϣ.........");
			Thread.sleep(7);
			System.out.println("!!!!!!!!!����������!!!!!!!!!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(;state>0;state-=2) {
			System.out.println("���ӻ���"+state+"��");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���ӵ����յ�");
	}

}
