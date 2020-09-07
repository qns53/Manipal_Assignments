package com.pack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass st=SingletonClass.createObject();
		
		st.setId(23);
		System.out.println(st.getId());
		
		SingletonClass st1=SingletonClass.createObject();
		
		System.out.println(st1.getId());
		st1.setId(32);
		
		System.out.println("st: "+st.getId());
		System.out.println("st1: "+st1.getId());
	}

}
