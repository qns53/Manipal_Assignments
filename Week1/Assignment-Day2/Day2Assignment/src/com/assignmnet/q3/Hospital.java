package com.assignmnet.q3;

public class Hospital {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Baby b=new Baby("zxc", 10.23);
		
		if(b.health()<10.5) {
			System.out.println("Undernurished");
			
		}
		else if(b.health()<60.2) {
			System.out.println("healthy");
		}
		else {
			System.out.println("Overnourished");
		}
	}

}
