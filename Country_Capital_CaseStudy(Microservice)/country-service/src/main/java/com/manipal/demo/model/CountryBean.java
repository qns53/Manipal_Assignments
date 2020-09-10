package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="countries")
public class CountryBean {
	
	@Id
	@Column(name="country_code")
	private String countryCode;
	@Column(name="name")
	private String name;
	
	public CountryBean() {}

	public CountryBean(String countryCode, String name) {
		super();
		this.countryCode = countryCode;
		this.name = name;
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
	
	
	
}
