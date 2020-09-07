package com.manipal.service;

public interface IAtheleteService {
	public boolean validateName(String name);
	public boolean validateGender(String gender);
	public boolean validateCategory(String category);
	public boolean validateEmail(String email);
	public boolean validateMobile(String mob);
}
