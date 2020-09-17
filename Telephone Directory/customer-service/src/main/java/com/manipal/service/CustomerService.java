package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.exception.CustomerNotFoundException;
import com.manipal.model.Customer;
import com.manipal.model.Telephone;
import com.manipal.proxy.ITelephoneProxy;
import com.manipal.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomerRepository repository;
	
	@Autowired
	private ITelephoneProxy proxy;

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void addOrUpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		Customer c=repository.findById(id).orElse(null);
		if(c==null)throw new CustomerNotFoundException("Enter valid ID");
		repository.deleteById(id);
	}

	@Override
	public Telephone getCustomerbyTelephone(long id) {
		// TODO Auto-generated method stub
		Customer c=repository.findById(id).orElse(null);
		if(c==null)return null;
		
		return proxy.getTelephone(c.getTelephoneNo());
	}
	
}
