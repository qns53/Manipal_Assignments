package com.assignment.q4;

public class Player {
	Dice d1;
	Dice d2;
	int r1,r2;
	public Player() {
		super();
		d1=new Dice();
		d2=new Dice();
	}
	
	public int play() {
		r1=d1.roll();
		r2=d2.roll();
		return r1+r2;
	}
	public int getD1() {
		return r1;
	}
	public int getD2() {
		return r2;
	}

}
