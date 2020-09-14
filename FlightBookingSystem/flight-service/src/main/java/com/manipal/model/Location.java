package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {
	
	@Id
	@Column(name="location_id")
	private long location_id;
	@Column(name="country")
	private String country;
	@Column(name="name")
	private String name;
	@Column(name="airport")
	private String airport;
	@Column(name="code")
	private String code;
	
	public Location() {}

	public Location(long location_id, String country, String name, String airport, String code) {
		super();
		this.location_id = location_id;
		this.country = country;
		this.name = name;
		this.airport = airport;
		this.code = code;
	}

	public long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(long location_id) {
		this.location_id = location_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Location [location_id=" + location_id + ", country=" + country + ", name=" + name + ", airport="
				+ airport + ", code=" + code + "]";
	}
	
	
}
