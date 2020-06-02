package com._11.test._3;

public class DrawMoney implements Runnable {
	private Account account;
	private double amount; 
	public DrawMoney() {
		super();
	}
	public DrawMoney(Account account,double amount) {
		super();
		this.account=account;
		this.amount=amount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.account.drawMoney(amount);
	}
}
