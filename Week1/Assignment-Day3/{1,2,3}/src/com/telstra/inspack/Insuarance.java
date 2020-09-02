package com.telstra.inspack;

import com.telstra.emppack.Employee;

public class Insuarance {
	public double getCover(Employee emp) {
		if(emp.calcNetSal()>2000000) {
			return emp.calcNetSal()*5;
		}
		else {
			return emp.calcNetSal()*7;
		}
	}
	
	public double getPremium(Employee emp) {
		if(emp.calcNetSal()>2000000) {
			return emp.calcNetSal()*5/100;
		}
		else {
			return emp.calcNetSal()*7/70;
		}
	}
}
