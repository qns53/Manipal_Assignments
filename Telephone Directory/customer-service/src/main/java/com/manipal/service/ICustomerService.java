package com.manipal.service;

import java.util.List;

import com.manipal.model.Customer;
import com.manipal.model.Telephone;

public interface ICustomerService {
	public Customer getCustomerById(long id);
	public void addOrUpdateCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public void deleteCustomer(long id);
	public Telephone getCustomerbyTelephone(long id);
}
