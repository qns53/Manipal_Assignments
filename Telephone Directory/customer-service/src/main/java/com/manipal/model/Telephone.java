package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telephonerecords")
public class Telephone {
	@Id
	@Column(name="telephone_id")
	private long telephoneId;
	@Column(name="telephone_no")
	private long telephoneNo;
	@Column(name="mobile_no")
	private long mobileNo;
	
	public Telephone() {}

	public Telephone(long telephoneId, long telephoneNo, long mobileNo) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNo = telephoneNo;
		this.mobileNo = mobileNo;
	}

	public long getTelephoneId() {
		return telephoneId;
	}

	public void setTelephoneId(long telephoneId) {
		this.telephoneId = telephoneId;
	}

	public long getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(long telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telephoneNo=" + telephoneNo + ", mobileNo=" + mobileNo
				+ "]";
	}
	
	
}
