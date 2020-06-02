package com._11.test._2;
/**
 * 2、	三个售票窗口同时出售20张票
 * 程序分析：    (1)票数要使用同一个静态值    
 *             (2)为保证不会出现卖出同一个票数，要java多线程同步锁。
 * 设计思路：    (1)创建一个站台类Station，，重写run方法，在run方法里面执行售票操作！
 *                售票要使用同步锁：即有一个站台卖这张票时，其他站台要等这张票卖完！
 *             (2)创建主类调用
 * */
public class Station implements Runnable {
	private int ticket=20;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			synchronized(this) {
				if(ticket>0) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":票数-1；"+"剩余"+(ticket--)+"张");
				}
			}
		}
	}

}
