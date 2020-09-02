package com.assignment.q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank XYZ=new Bank();
		
		User newUser=XYZ.register("ZXC");
		
		newUser.deposit(1000);
		System.out.println(newUser.getBalance());
		newUser.withdraw(500);
		System.out.println(newUser.getBalance());

	}

}
