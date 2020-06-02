package com._11.test._4;

public class Tortoise implements Runnable {
	int state=2000;
	public Tortoise() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;state>0;state-=2) {
			System.out.println("乌龟还有"+state+"米");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		System.out.println("乌龟到达终点");
	
	}

}
