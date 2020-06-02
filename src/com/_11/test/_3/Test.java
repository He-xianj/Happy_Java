package com._11.test._3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		Thread t1=new Thread(new DrawMoney(account,800),"��̨ȡǮ");
		Thread t2=new Thread(new DrawMoney(account,800),"ATMȡǮ");
		t1.start();
		t2.start();
	}

}
