package com.example.model;

import java.util.Map;

public class TempCalculatorBean {
	private long id;
	private String from;
	private String to;
	private int port;
	Map<String,Double> constants;
	private double result;
	private double unit;
	
	public TempCalculatorBean() {}
	
	
	

	public TempCalculatorBean(long id, String from, String to, int port, Map<String, Double> constants, double result,
			double unit) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;
		this.constants = constants;
		this.result = result;
		this.unit = unit;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Map<String, Double> getConstants() {
		return constants;
	}

	public void setConstants(Map<String, Double> constants) {
		this.constants = constants;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}
	
	
}
