package com.example.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.model.ConversionRate;


@Service
public class TempratureConversionService {
	
	@Autowired
	private Environment enviroment;
	public ConversionRate conversion(String from,String to) {
		
		if((from.equals("C")||from.equals("c"))&&(to.equals("F")||to.equals("f"))) {
			Map<String,Double> map=new LinkedHashMap<String,Double>();
			double c1=9/5;
			map.put("c1",c1);
			map.put("c2",32.0);
			return new ConversionRate(1L,from,to,Integer.parseInt(enviroment.getProperty("local.server.port")),map);
			
		}
		if((from.equals("C")||from.equals("c"))&&(to.equals("K")||to.equals("k"))) {
			Map<String,Double> map=new LinkedHashMap<String,Double>();
			
			map.put("c1",273.15);
		
			return new ConversionRate(1L,from,to,Integer.parseInt(enviroment.getProperty("local.server.port")),map);
			
		}
		if((from.equals("F")||from.equals("f"))&&(to.equals("C")||to.equals("c"))) {
			Map<String,Double> map=new LinkedHashMap<String,Double>();
			double c2=5/9;
			map.put("c1",-32.0);
			map.put("c2",c2);
			return new ConversionRate(1L,from,to,Integer.parseInt(enviroment.getProperty("local.server.port")),map);
			
		}
		if((from.equals("F")||from.equals("f"))&&(to.equals("K")||to.equals("k"))) {
			Map<String,Double> map=new LinkedHashMap<String,Double>();
			double c2=5/9;
			map.put("c1",-32.0);
			map.put("c2",c2);
			map.put("c3",273.15);
			return new ConversionRate(1L,from,to,Integer.parseInt(enviroment.getProperty("local.server.port")),map);
			
		}
		if((from.equals("K")||from.equals("k"))&&(to.equals("F")||to.equals("f"))) {
			Map<String,Double> map=new LinkedHashMap<String,Double>();
			double c2=9/5;
			map.put("c1",-273.15);
			map.put("c2",c2);
			map.put("c3",32.0);
			return new ConversionRate(1L,from,to,Integer.parseInt(enviroment.getProperty("local.server.port")),map);
			
		}
		
		if((from.equals("K")||from.equals("k"))&&(to.equals("C")||to.equals("c"))) {
			Map<String,Double> map=new LinkedHashMap<String,Double>();
			
			map.put("c1",-273.15);
		
			return new ConversionRate(1L,from,to,Integer.parseInt(enviroment.getProperty("local.server.port")),map);
			
		}
		return null;
	}
}
