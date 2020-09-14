package com.manipal.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="schedule")
public class Schedule {
	@Id
	@Column(name="schedule_id")
	private long schedule_id;
	@Column(name="flight_id")
	private long flight_id;
	@Column(name="departure")
	private LocalDateTime departure;
	@Column(name="arrival")
	private LocalDateTime arrival;
	
	public Schedule() {}

	public Schedule(long flight_id, LocalDateTime departure, LocalDateTime arrival) {
		super();
		this.flight_id = flight_id;
		this.departure = departure;
		this.arrival = arrival;
	}

	public long getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(long flight_id) {
		this.flight_id = flight_id;
	}

	public LocalDateTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}

	public LocalDateTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		return "Schedule [flight_id=" + flight_id + ", departure=" + departure + ", arrival=" + arrival + "]";
	}
	
	
}
