package com.manipal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@Column(name="id")
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="dob")
	private LocalDate dob;
	@Column(name="telephone_no")
	private long telephoneNo;
	@Column(name="email")
	private String email;
	
	public Customer() {}

	public Customer(long id, String firstName, String lastName, LocalDate dob, long telephoneNo, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.telephoneNo = telephoneNo;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(long telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", telephoneNo=" + telephoneNo + ", email=" + email + "]";
	}
	
	
	
}
