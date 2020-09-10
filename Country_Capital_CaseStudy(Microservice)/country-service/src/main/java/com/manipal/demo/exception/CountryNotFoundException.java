package com.manipal.demo.exception;

public class CountryNotFoundException extends RuntimeException{
	String message;

	public CountryNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
