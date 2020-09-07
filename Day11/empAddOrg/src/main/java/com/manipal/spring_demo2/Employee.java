package com.manipal.spring_demo2;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private long empId;
	private String empName;
	private double salary;
	private Set<Address> addresses;
	
	public long getEmpId() {
		return empId;
	}
	@Autowired
	public Employee(long empId, String empName, double salary,Set<Address> addresses) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.addresses=addresses;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + addresses
				+ "]\n";
		
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<Address> getAddress() {
		return addresses;
	}
	@Autowired
	@Qualifier("address2")
	public void setAddress(Set<Address> addresses) {
		this.addresses = addresses;
	}


	public Employee() {}

	
	
}
