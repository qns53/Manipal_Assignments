package com.manipal.exception;

public class CustomerNotFoundException extends RuntimeException{
	String message;

	public CustomerNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
