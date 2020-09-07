package com.pack;

public class SingletonClass {
	private int id;
	private static SingletonClass st=null;
	
	public static SingletonClass createObject() {
		if(st==null) {
			System.out.println("Inside null statement");
			st=new SingletonClass();
			return st;
		}
		else {
			System.out.println("Inside Not Null");
			return st;
		}
	}

	private SingletonClass() {
		
		
		
		
		
	}
	
	public void setId(int i) {
		id=i;
	}
	
	public int getId() {
		return id;
	}
}
