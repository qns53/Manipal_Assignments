package com.manipal.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.manipal.demo.model.Capital;
import com.manipal.demo.model.CapitalBean;
import com.manipal.demo.repository.ICapitalRepository;

@Service
public class CapitalService {
	
	@Autowired
	ICapitalRepository repository;
	
	public Capital getCapitalbyName(String name,int port) {
		
		CapitalBean capital=repository.findByName(name);
		return new Capital(capital.getZipcode(),capital.getName(),capital.getLanguage(),capital.getPopulation(),capital.getCountryCode(),port);
	}
	
	public Capital getCapitalbyZipcode(String zipcode,int port) {
		CapitalBean capital=repository.findByZipcode(zipcode);
		return new Capital(capital.getZipcode(),capital.getName(),capital.getLanguage(),capital.getPopulation(),capital.getCountryCode(),port);
	}
	
	public void addCapital(CapitalBean c) {
		repository.save(c);
	}
	
	public Capital getCapitalbyCountryCode(String code,int port) {
		CapitalBean capital=repository.findByCountryCode(code);
		return new Capital(capital.getZipcode(),capital.getName(),capital.getLanguage(),capital.getPopulation(),capital.getCountryCode(),port);
	}
	
	public List<Capital> getAll(int port){
		List<CapitalBean> list=repository.findAll();
		
		List<Capital> capitals=new LinkedList<Capital>();
		for(CapitalBean capital:list) {
			capitals.add(new Capital(capital.getZipcode(),capital.getName(),capital.getLanguage(),capital.getPopulation(),capital.getCountryCode(),port));
		}
		
		return capitals;
	}
	
}
