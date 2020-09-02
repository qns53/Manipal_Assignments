package com.assignment.q1;

public class State {
	
	public String name;
	private String place1;
	private String place2;
	private String place3;
	
	public State(String name,String place1,String place2,String place3) {
		super();
		this.name=name;
		this.place1=place1;
		this.place2=place2;
		this.place3=place3;
		
	}
	
	public String getPlaces() {
		
		return "Places you can visit: "+place1+" "+place2+" "+place3;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", place1=" + place1 + ", place2=" + place2 + ", place3=" + place3 + "]";
	}

}
