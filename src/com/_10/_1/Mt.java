package com._10._1;

public class Mt extends Thread {

	public Mt() {
		// TODO Auto-generated constructor stub
	}

	public Mt(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public Mt(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Mt(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public Mt(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	public Mt(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public Mt(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public Mt(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public Mt(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
		super(group, target, name, stackSize, inheritThreadLocals);
		// TODO Auto-generated constructor stub
	}
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"  第"+(i+1)+"次运行");
		}
	}
}
