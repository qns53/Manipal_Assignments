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

import com.manipal.exception.TelephoneNotFoundException;
import com.manipal.model.Telephone;
import com.manipal.service.TelephoneService;

@RestController
@RequestMapping("/telephone-service")
public class TelephoneController {
	
	
	@Autowired
	TelephoneService service;
	
	@GetMapping("/telephone")
	public List<Telephone> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/telephone")
	public String addOrUpdate(@RequestBody Telephone tel) {
		return service.addOrUpdate(tel);
	}
	
	@GetMapping("/telephone/{telephoneId}")
	public Telephone getById(@PathVariable long telephoneId) {
		return service.getTelById(telephoneId);
	}
	
	@GetMapping("/telephoneNumber/{telephoneNo}")
	public Telephone getByTel(@PathVariable long telephoneNo) {
		return service.getTelByNo(telephoneNo);
	}
	
	@PutMapping("/telephone")
	public String put(@RequestBody Telephone tel) {
		return service.addOrUpdate(tel);
	}
	
	@DeleteMapping("/telephone/{telephoneId}")
	public String delete(@PathVariable long telephoneId) {
	
		service.delTel(telephoneId);
		
		return "Deleted Successfully";
	}
}
