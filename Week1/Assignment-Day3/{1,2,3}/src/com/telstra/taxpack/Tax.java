package com.telstra.taxpack;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.emppack.Programmer;

public class Tax {
	
	private double clacTax(double salary) {
		if(salary>1000000) {
			return salary*0.15;
		}
		else if(salary> 2000000) {
			return salary*0.2;
		}
		else if(salary>500000) {
			return salary*0.10;
		}
		else {
			return 0.0;
		}
	}
	
	public  double calc_Tax(Employee emp)
	{
		 return clacTax(emp.calcNetSal());
	}

}
