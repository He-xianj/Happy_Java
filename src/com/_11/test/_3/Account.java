package com._11.test._3;

public class Account {
	private double balance=1000;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void drawMoney(double amount) {
		synchronized(this) {
			System.out.println(Thread.currentThread().getName());
			double newBalance=this.balance-amount;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(newBalance>=0) {
				this.balance=newBalance;
				System.out.println("»°«Æ£∫"+amount+",”‡∂Ó"+this.balance);
			}else {
				System.out.println("»°«Æ£∫"+amount+", ß∞‹");
			}
		}
	}
}
