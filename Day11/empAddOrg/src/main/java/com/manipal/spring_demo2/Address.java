package com.manipal.spring_demo2;

public class Address {
	private int streetNo;
	private String city;
	private int pin;
	
	public Address() {}
	public Address(int streetNo, String city, int pin) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.pin = pin;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", pin=" + pin + "]\n";
	}
	
}
