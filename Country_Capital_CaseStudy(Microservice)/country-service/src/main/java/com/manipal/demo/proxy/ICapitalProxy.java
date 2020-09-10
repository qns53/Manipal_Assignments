package com.manipal.demo.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Capital;



@FeignClient(name="capital-service")
@RibbonClient(name= "capital-service")
public interface ICapitalProxy {
	@GetMapping("capital-service/countryCode/{countryCode}")
	public Capital retrieveCapitalValue(@PathVariable String countryCode);
	
	@GetMapping("capital-service/all")
	public List<Capital> retrieveCapitalsValue();
}
