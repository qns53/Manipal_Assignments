package com.manipal.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.Telephone;



@FeignClient(name="telephone-service")
@RibbonClient(name= "telephone-service")
public interface ITelephoneProxy {
	@GetMapping("telephone-service/telephoneNumber/{telephoneNo}")
	public Telephone getTelephone(@PathVariable long telephoneNo);
}
