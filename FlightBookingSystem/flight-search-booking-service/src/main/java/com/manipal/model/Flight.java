package com.manipal.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Flight {
	
	private int flightId;
	private LocalTime arrivalTime;
	private LocalTime departureTime;
	private int arrivalLocationId;
	private int departureLocationId;
	private int fleetId;
	private int fareId;
	private int flightStatusId;
	
	public Flight() {}

	public Flight(int flightId, LocalTime arrivalTime, LocalTime departureTime, int arrivalLocationId,
			int departureLocationId, int fleetId, int fareId, int flightStatusId) {
		super();
		this.flightId = flightId;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.arrivalLocationId = arrivalLocationId;
		this.departureLocationId = departureLocationId;
		this.fleetId = fleetId;
		this.fareId = fareId;
		this.flightStatusId = flightStatusId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public int getArrivalLocationId() {
		return arrivalLocationId;
	}

	public void setArrivalLocationId(int arrivalLocationId) {
		this.arrivalLocationId = arrivalLocationId;
	}

	public int getDepartureLocationId() {
		return departureLocationId;
	}

	public void setDepartureLocationId(int departureLocationId) {
		this.departureLocationId = departureLocationId;
	}

	public int getFleetId() {
		return fleetId;
	}

	public void setFleetId(int fleetId) {
		this.fleetId = fleetId;
	}

	public int getFareId() {
		return fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	public int getFlightStatusId() {
		return flightStatusId;
	}

	public void setFlightStatusId(int flightStatusId) {
		this.flightStatusId = flightStatusId;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", arrivalLocationId=" + arrivalLocationId + ", departureLocationId=" + departureLocationId
				+ ", fleetId=" + fleetId + ", fareId=" + fareId + ", flightStatusId=" + flightStatusId + "]";
	}
	
	
	
	
	
}
