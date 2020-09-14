package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fleet")
public class Fleet {
	
	@Id
	@Column(name="fleet_id")
	private long fleet_id;
	@Column(name="total_seats")
	private int totalSeats;
	@Column(name="code")
	private String code;
	@Column(name="model")
	private String model;
	
	public Fleet() {}

	public Fleet(long fleet_id, int totalSeats, String code, String model) {
		super();
		this.fleet_id = fleet_id;
		this.totalSeats = totalSeats;
		this.code = code;
		this.model = model;
	}

	public long getFleet_id() {
		return fleet_id;
	}

	public void setFleet_id(long fleet_id) {
		this.fleet_id = fleet_id;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Fleet [fleet_id=" + fleet_id + ", totalSeats=" + totalSeats + ", code=" + code + ", model=" + model
				+ "]";
	}
	
	
}
