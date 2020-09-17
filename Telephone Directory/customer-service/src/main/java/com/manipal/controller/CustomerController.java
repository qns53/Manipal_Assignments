package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Customer;
import com.manipal.model.Telephone;
import com.manipal.service.CustomerService;

@RestController
@RequestMapping("/customer-service")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer")
	public List<Customer> getAll(){
		return service.getAllCustomers();
	}
	@PostMapping("/customer")
	public String addOrUpdate(@RequestBody Customer cus) {
		service.addOrUpdateCustomer(cus);
		
		return "Added Successfully";
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getById(@PathVariable long customerId) {
		return service.getCustomerById(customerId);
	}
	
	@PutMapping("/customer")
	public String put(@RequestBody Customer cus) {
		service.addOrUpdateCustomer(cus);
		
		return "Updated";
	}
	
	@DeleteMapping("/customer/{customerId}")
	public String delete(@PathVariable long customerId) {
	
		service.deleteCustomer(customerId);
		
		return "Deleted Successfully";
	}
	
	@GetMapping("/customer/{customerId}/telephone")
	public Telephone getTelephone(@PathVariable long customerId){
		return service.getCustomerbyTelephone(customerId);
	}
}
