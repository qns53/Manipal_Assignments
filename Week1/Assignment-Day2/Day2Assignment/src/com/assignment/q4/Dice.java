package com.assignment.q4;

import java.util.Random;


	public class Dice {
		
		public int roll() {
			
			Random rn=new Random();
			return ((int)rn.nextInt(5)+1);
			
		}

	}

