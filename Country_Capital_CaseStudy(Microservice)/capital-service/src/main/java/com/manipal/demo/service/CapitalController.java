package com.manipal.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.manipal.demo.model.Capital;
import com.manipal.demo.model.CapitalBean;

@RestController
public class CapitalController {
	
	@Autowired
	private CapitalService service;
	
	@Autowired
	private Environment enviroment;
	
	@GetMapping(value="capital-service/capital/{capitalName}")
	public  Capital getCapital(@PathVariable String capitalName) {
		return service.getCapitalbyName(capitalName, Integer.parseInt(enviroment.getProperty("local.server.port")));
	}
	
	@GetMapping(value="capital-service/countryCode/{code}")
	public  Capital getCapital2(@PathVariable String code) {
		return service.getCapitalbyCountryCode(code, Integer.parseInt(enviroment.getProperty("local.server.port")));
	}
	
	@GetMapping(value="capital-service/zipcode/{zipcode}")
	public  Capital getCapital1(@PathVariable String zipcode) {
		return service.getCapitalbyZipcode(zipcode, Integer.parseInt(enviroment.getProperty("local.server.port")));
	}
	@PostMapping(value="capital-service/add")
	public  String getCapital1(@RequestBody CapitalBean cb) {
		try{
			service.addCapital(cb);
		}
		catch(Exception e) {
			return "Failed";
		}
		return "Added";
	}
	
	@GetMapping(value="capital-service/all")
	public  List<Capital> getCapitals() {
		return service.getAll(Integer.parseInt(enviroment.getProperty("local.server.port")));
	}
}
