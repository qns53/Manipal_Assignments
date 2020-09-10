package com.manipal.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.model.CountryBean;
import com.manipal.demo.proxy.ICapitalProxy;
import com.manipal.demo.exception.CountryNotFoundException;

import com.manipal.demo.repository.ICountryRepository;

@Service
public class CountryService {
	
	
	@Autowired
	ICountryRepository repository;
	
	@Autowired
	ICapitalProxy proxy;
	
	public Country getCountryByName(String name) {
		
		CountryBean cb=repository.findByName(name);
		Capital capital=proxy.retrieveCapitalValue(cb.getCountryCode());
		if(cb==null||capital==null)throw new CountryNotFoundException("Country Information Not Found");
		
		return new Country(cb.getCountryCode(),cb.getName(),capital);
	}
	
	public void addCountry(CountryBean cb) {
		repository.save(cb);
	}
	
	public List<Country> getAll(){
		List<CountryBean> list=repository.findAll();
		List<Capital> capitals=proxy.retrieveCapitalsValue();
		List<Country> countries=new ArrayList<Country>();
		System.out.println(capitals);
		for(CountryBean country:list) {
			Capital capital=null;
			for(Capital c:capitals) {
				if(c.getCountryCode().equals(country.getCountryCode())) {
					capital=c;
					break;
				}
			}
			
			countries.add(new Country(country.getCountryCode(),country.getName(),capital));
		}
		
		return countries;
	}
}
