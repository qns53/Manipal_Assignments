package com.manipal.service;

import java.util.List;

import com.manipal.model.Telephone;

public interface ITelephoneService {
	public List<Telephone> getAll();
	public Telephone getTelById(long id);
	public Telephone getTelByNo(long no);
	public String addOrUpdate(Telephone tel);
	public void delTel(long id);
	
}
