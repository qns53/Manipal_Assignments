package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class Status {
	@Id
	@Column(name="status_id")
	private long status_id;
	@Column(name="remaining_seats")
	private int remainingSeats;
	
	public Status() {}

	public Status(long status_id, int remainingSeats) {
		super();
		this.status_id = status_id;
		this.remainingSeats = remainingSeats;
	}

	public long getStatus_id() {
		return status_id;
	}

	public void setStatus_id(long status_id) {
		this.status_id = status_id;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}

	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", remainingSeats=" + remainingSeats + "]";
	}
	
	
}
