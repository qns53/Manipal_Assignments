package com.manipal.dao;

import java.util.List;

import com.manipal.model.Athelete;



public interface IAtheleteDAO {
	public int addAthelete(Athelete ath);
	public List<Athelete> getAllAtheletes();
}
