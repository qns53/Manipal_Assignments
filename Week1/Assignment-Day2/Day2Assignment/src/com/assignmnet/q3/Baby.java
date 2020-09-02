package com.assignmnet.q3;

public class Baby {
	
	public String name;
	public double weight;
	
	public Baby(String name,double weight) {
		super();
		this.name=name;
		this.weight=weight;
	}
	
	public double health() {
		return weight/10 +15;
	}
}
