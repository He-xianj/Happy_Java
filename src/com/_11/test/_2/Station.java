package com._11.test._2;
/**
 * 2��	������Ʊ����ͬʱ����20��Ʊ
 * ���������    (1)Ʊ��Ҫʹ��ͬһ����ֵ̬    
 *             (2)Ϊ��֤�����������ͬһ��Ʊ����Ҫjava���߳�ͬ������
 * ���˼·��    (1)����һ��վ̨��Station������дrun��������run��������ִ����Ʊ������
 *                ��ƱҪʹ��ͬ����������һ��վ̨������Ʊʱ������վ̨Ҫ������Ʊ���꣡
 *             (2)�����������
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
					System.out.println(Thread.currentThread().getName()+":Ʊ��-1��"+"ʣ��"+(ticket--)+"��");
				}
			}
		}
	}

}
