package com._10._2;

public class Tortoise implements Runnable {
	int state=10;
	public Tortoise() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;state>0;state--) {
			System.out.println("�ڹ껹��"+state+"��");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		System.out.println("�ڹ굽���յ�");
	
	}

}
