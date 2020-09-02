package com.assignment.q2;

public class User {
	
	public String name;
	public Account acc;
	
	public User(String name) {
		super();
		this.name=name;
		acc=new Account();
	}
	
	public int getAccountNumber() {
		return acc.acNo;
	}
	public int getBalance() {
		return acc.getBalance();
	}
	public void deposit(int amt) {
		acc.addBalance(amt);
	}
	public void withdraw(int amt) {
		if(!acc.subractBalance(amt)) {
			System.out.println("operation Failed");
		}
	}

}
