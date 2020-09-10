package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TempCalculatorBean;
import com.example.service.TempCalculationService;



@RestController
public class TempCalculationController {
		@Autowired
		TempCalculationService service;

	
	@GetMapping("temp-calculator/from/{from}/to/{to}/unit/{unit}")
	public TempCalculatorBean calculateUnit(@PathVariable String from,@PathVariable String to,@PathVariable double unit) {
		
		//TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
		//double totalUnits=bean.getConversionMultiple()*unit;
		//return new TempCalculatorBean(1L,from,to,bean.getConversionMultiple(),unit,totalUnits,bean.getPort());
		return service.calculate(from, to, unit);
	}
}
