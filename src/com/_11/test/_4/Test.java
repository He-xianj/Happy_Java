package com._11.test._4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortoise t=new Tortoise();
		Rabbit r=new Rabbit();
		Thread t1=new Thread(t);
		Thread t2=new Thread(r);
		System.out.println("------------------龟兔赛跑开始----------------");
		t1.start();
		t2.start();
		while(true) {
			if(t.state==0) {
				System.out.println("乌龟先到达终点");
				System.out.println("！——！——！——乌龟胜利——！——！——！——！——！");
				t2.interrupt();
				break;
			}else if(r.state==0) {
				System.out.println("兔子先到达终点");
				System.out.println("！——！——！——兔子胜利——！——！——！——！——！");
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
