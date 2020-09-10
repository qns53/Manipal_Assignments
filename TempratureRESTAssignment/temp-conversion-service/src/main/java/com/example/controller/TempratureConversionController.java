package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ConversionRate;

import com.example.service.TempratureConversionService;

@RestController
public class TempratureConversionController {

	
	@Autowired
	TempratureConversionService service;
	
	@GetMapping(value="temp-conversion/from/{from}/to/{to}")
	public  ConversionRate getConversionRate(@PathVariable String from,@PathVariable String to) {
		return service.conversion(from, to);
	}
}
