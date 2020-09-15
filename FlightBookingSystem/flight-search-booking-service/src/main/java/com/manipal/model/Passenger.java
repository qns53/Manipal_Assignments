package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	@Column(name="passenger_id")
	private long passenger_id;
	@Column(name="passport_no")
	private String passportNo;
	@Column(name="meal_pref")
	private String mealPref;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="booking_id")
	private long booking_id;
	
	public Passenger() {}

	public Passenger(long passenger_id, String passportNo, String mealPref, String firstName, String lastName, int age,
			String gender, long booking_id) {
		super();
		this.passenger_id = passenger_id;
		this.passportNo = passportNo;
		this.mealPref = mealPref;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.booking_id = booking_id;
	}

	public long getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(long passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getMealPref() {
		return mealPref;
	}

	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	@Override
	public String toString() {
		return "Passenger [passenger_id=" + passenger_id + ", passportNo=" + passportNo + ", mealPref=" + mealPref
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", booking_id=" + booking_id + "]";
	}
	
	
	
}
