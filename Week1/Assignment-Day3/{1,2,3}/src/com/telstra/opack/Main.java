package com.telstra.opack;

import com.telstra.emppack.Employee;
import com.telstra.emppack.Manager;
import com.telstra.emppack.Programmer;
import com.telstra.inspack.Insuarance;
import com.telstra.taxpack.Tax;

public class Main {

	public static void main(String[] args) {
		//Dynamic polymorphism 

		Employee[] empList=new Employee[3];
		
		empList[0]=new Manager(0, "xzc", 8000000, "IT", 10);
		empList[1]=new Programmer(1, "qaz", 700000, 2, "JAVA");
		empList[2]=new Programmer(2,"zaq",700000,1,"C");
		
		Tax t=new Tax();
		Insuarance i=new Insuarance();
		for(Employee emp:empList) {
			System.out.println("Tax: "+t.calc_Tax(emp));
			System.out.println("Insuarance Cover: "+i.getCover(emp));
			System.out.println("Insuarance Premium: "+i.getPremium(emp));
		}

	}

}
