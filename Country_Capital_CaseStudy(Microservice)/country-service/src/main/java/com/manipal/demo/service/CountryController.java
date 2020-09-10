package com.manipal.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import com.manipal.demo.model.Country;
import com.manipal.demo.model.CountryBean;

@RestController
public class CountryController {
	
	@Autowired
	CountryService service;
	@GetMapping("country-service/country/{countryName}")
	public Country getCountry(@PathVariable String countryName) {
		
		//MetricCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
		 return service.getCountryByName(countryName);
		//return null;
	}
	
	@GetMapping("country-service/all")
	public List<Country> getCountries() {
		
		//MetricCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
		 return service.getAll();
		//return null;
	}
	
	@PostMapping("country-service/add")
	public String calculateUnit(@RequestBody CountryBean country) {
		
		try{
			service.addCountry(country);
		}
		catch(Exception e) {
			return "Operation Failed";
		}
		
		return "Added";
	}
}
