package com.manipal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@Column(name="booking_id")
	private long booking_id;
	@Column(name="person_id")
	private long person_id;
	@Column(name="booking_date")
	private LocalDate bookingDate;
	@Column(name="travel_date")
	private LocalDate traveDate;
	@Column(name="total_cost")
	private double totalCost;
	@Column(name="flight_booked")
	private boolean flightBooked;
	@Column(name="flight_id")
	private long flight_id;
	
	public Booking() {}

	public Booking(long booking_id, long person_id, LocalDate bookingDate, LocalDate traveDate, double totalCost,
			boolean flightBooked, long flight_id) {
		super();
		this.booking_id = booking_id;
		this.person_id = person_id;
		this.bookingDate = bookingDate;
		this.traveDate = traveDate;
		this.totalCost = totalCost;
		this.flightBooked = flightBooked;
		this.flight_id = flight_id;
	}

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	public long getPerson_id() {
		return person_id;
	}

	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getTraveDate() {
		return traveDate;
	}

	public void setTraveDate(LocalDate traveDate) {
		this.traveDate = traveDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public boolean isFlightBooked() {
		return flightBooked;
	}

	public void setFlightBooked(boolean flightBooked) {
		this.flightBooked = flightBooked;
	}

	public long getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(long flight_id) {
		this.flight_id = flight_id;
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", person_id=" + person_id + ", bookingDate=" + bookingDate
				+ ", traveDate=" + traveDate + ", totalCost=" + totalCost + ", flightBooked=" + flightBooked
				+ ", flight_id=" + flight_id + "]";
	}
	
	
	
}
