package com.assignment.q1;

import java.util.*;
public class Application {

		private State[] states;
		
		public Application() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter No of ");
			int i=sc.nextInt();
			states=new State[i];
			for(int j=0;j<i;j++) {
				
				System.out.println("Entre State Name");
				String name=sc.nextLine();
				System.out.println("Enter 1 Location");
				String loc1=sc.nextLine();
				System.out.println("Enter 2 Location");
				String loc2=sc.nextLine();
				System.out.println("Enter 3 Location");
				String loc3=sc.nextLine();
				states[j]=new State(name,loc1,loc2,loc3);
				
				System.out.println(states[j]);
			}
			
		}
		
		public String getLocsFromState(String name) {
			for(int i=0;i<states.length;i++) {
				if(states[i].name.equals(name)) {
					return states[i].getPlaces();
				}
			}
			return "State Not Found";
		}
}
