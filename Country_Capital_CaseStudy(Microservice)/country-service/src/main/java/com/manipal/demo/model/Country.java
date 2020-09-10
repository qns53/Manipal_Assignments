package com.manipal.demo.model;

public class Country {
	private String countryCode;
	private String name;
	private Capital capital;
	
	public Country(){}

	public Country(String countryCode, String name, Capital capital) {
		super();
		this.countryCode = countryCode;
		this.name = name;
		this.capital = capital;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	
	
	
}
	
	
