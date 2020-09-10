package com.example.model;

import java.util.Map;

public class ConversionRate {
	private long id;
	private String from;
	private String to;
	private int port;
	Map<String,Double> constants;
	
	public ConversionRate() {}
	
	
	public ConversionRate(long id, String from, String to, int port, Map<String, Double> constants) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;
		this.constants = constants;
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
	
	
}
