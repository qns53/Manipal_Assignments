package com.example.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.TempCalculatorBean;
import com.example.proxy.ITempConversionProxy;

@Service
public class TempCalculationService {
	
	
	@Autowired
	ITempConversionProxy proxy;
	public TempCalculatorBean calculate(String from,String to, double unit) {
		
		if((from.equals("C")||from.equals("c"))&&(to.equals("F")||to.equals("f"))) {
			TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
			double result=(unit*bean.getConstants().get("c1"))+bean.getConstants().get("c2");
			return new TempCalculatorBean(1L,from,to,bean.getPort(),bean.getConstants(),result,unit);
			
		}
		if((from.equals("C")||from.equals("c"))&&(to.equals("K")||to.equals("k"))) {
			TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
			double result=unit+bean.getConstants().get("c1");
			return new TempCalculatorBean(1L,from,to,bean.getPort(),bean.getConstants(),result,unit);
			
		}
		if((from.equals("F")||from.equals("f"))&&(to.equals("C")||to.equals("c"))) {
			TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
			double result=(unit+bean.getConstants().get("c1"))*bean.getConstants().get("c2");
			return new TempCalculatorBean(1L,from,to,bean.getPort(),bean.getConstants(),result,unit);
			
		}
		if((from.equals("F")||from.equals("f"))&&(to.equals("K")||to.equals("k"))) {
			TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
			double result=(unit+bean.getConstants().get("c1"))*bean.getConstants().get("c2") + bean.getConstants().get("c3");
			return new TempCalculatorBean(1L,from,to,bean.getPort(),bean.getConstants(),result,unit);
			
		}
		if((from.equals("K")||from.equals("k"))&&(to.equals("F")||to.equals("f"))) {
			TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
			double result=(unit+bean.getConstants().get("c1"))*bean.getConstants().get("c2") + bean.getConstants().get("c3");
			return new TempCalculatorBean(1L,from,to,bean.getPort(),bean.getConstants(),result,unit);
			
		}
		
		if((from.equals("K")||from.equals("k"))&&(to.equals("C")||to.equals("c"))) {
			TempCalculatorBean bean=proxy.retrieveCalculatedValue(from, to);
			double result=unit+bean.getConstants().get("c1");
			return new TempCalculatorBean(1L,from,to,bean.getPort(),bean.getConstants(),result,unit);
			
		}
		return null;
	}
}
