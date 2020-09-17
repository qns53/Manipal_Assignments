package com.manipal.exception;

public class TelephoneNotFoundException extends RuntimeException{
	String message;

	public TelephoneNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
