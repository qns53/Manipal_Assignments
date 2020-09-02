package com.assignment.q4;

public class Stadium {
Player p1;
Player p2;

public Stadium() {
	p1=new Player();
	p2=new Player();
	
	int s1=p1.play();
	System.out.println("Dice1 "+p1.r1);
	System.out.println("Dice2 "+p1.r2);
	
	int s2=p2.play();
	System.out.println("Dice1 "+p2.r1);
	System.out.println("Dice2 "+p2.r2);
	
	if(s1>s2) {
		System.out.println("Player 1 Wins!!");
	}
	else if(s1<s2) {
		System.out.println("Player 2 Wins!!!!");
	}
	else {
		System.out.println("Tie");
	}
	
	
}


}
