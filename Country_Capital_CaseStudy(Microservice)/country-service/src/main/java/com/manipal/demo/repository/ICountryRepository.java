package com.manipal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.demo.model.CountryBean;

@Repository
public interface ICountryRepository  extends JpaRepository<CountryBean,String>{
	
	public CountryBean findByName(String name);

}
