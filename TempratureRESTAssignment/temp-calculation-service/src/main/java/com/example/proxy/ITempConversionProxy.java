package com.example.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.model.TempCalculatorBean;

@FeignClient(name="temp-conversion-service",url="http://localhost:8005")
public interface ITempConversionProxy {
	@GetMapping("temp-conversion/from/{from}/to/{to}")
	public TempCalculatorBean retrieveCalculatedValue(@PathVariable String from,@PathVariable String to);
}
