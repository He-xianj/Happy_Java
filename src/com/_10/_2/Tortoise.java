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
			System.out.println("乌龟还有"+state+"米");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		System.out.println("乌龟到达终点");
	
	}

}
