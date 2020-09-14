package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@Column(name="flight_id")
	private long flight_id;
	@Column(name="arrival_loc")
	private long arrivalLoc;
	@Column(name="depature_loc")
	private long depatureLoc;
	@Column(name="fleet_id")
	private long fleet_id;
	@Column(name="status_id")
	private long status_id;
	@Column(name="fare")
	private double fare;
	
	public Flight() {}

	public Flight(long flight_id, long arrivalLoc, long depatureLoc, long fleet_id, long status_id, double fare) {
		super();
		this.flight_id = flight_id;
		this.arrivalLoc = arrivalLoc;
		this.depatureLoc = depatureLoc;
		this.fleet_id = fleet_id;
		this.status_id = status_id;
		this.fare = fare;
	}

	public long getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(long flight_id) {
		this.flight_id = flight_id;
	}

	public long getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(long arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}

	public long getDepatureLoc() {
		return depatureLoc;
	}

	public void setDepatureLoc(long depatureLoc) {
		this.depatureLoc = depatureLoc;
	}

	public long getFleet_id() {
		return fleet_id;
	}

	public void setFleet_id(long fleet_id) {
		this.fleet_id = fleet_id;
	}

	public long getStatus_id() {
		return status_id;
	}

	public void setStatus_id(long status_id) {
		this.status_id = status_id;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Flight [flight_id=" + flight_id + ", arrivalLoc=" + arrivalLoc + ", depatureLoc=" + depatureLoc
				+ ", fleet_id=" + fleet_id + ", status_id=" + status_id + ", fare=" + fare + "]";
	}
	
	
	
}
