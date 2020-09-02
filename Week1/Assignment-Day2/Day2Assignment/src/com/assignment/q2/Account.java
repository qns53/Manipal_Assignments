package com.assignment.q2;

public class Account {
	public final int acNo;
	private int balance;
	
	private static int count;
	static {
		count=0;
	}
	private static int getCount() {
		return ++count;
	}
	
	public Account() {
		this.acNo=getCount();
		this.balance=0;
	}
	
	public int getBalance() {
		return balance;
	}
	public void addBalance(int amount) {
		
		if(amount<0)return;
		balance=balance+amount;
	}
	public boolean subractBalance(int amount) {
		if(balance<amount)return false;
		
		balance=balance-amount;
		return true;
	}

}
