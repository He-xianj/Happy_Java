package com._11.test._4;

public class Rabbit implements Runnable {
	int state=2000;
	public Rabbit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		int  t=0;
		// TODO Auto-generated method stub
		for(;state>0;state-=5) {
			System.out.println("兔子还有"+state+"米");
			t++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(t%4==0) {
				try {
					System.out.println("..........兔子正在休息.........");
					Thread.sleep(1000);
					System.out.println("!!!!!!!!!兔子起来了!!!!!!!!!!!!");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("兔子到达终点");
	}

}
