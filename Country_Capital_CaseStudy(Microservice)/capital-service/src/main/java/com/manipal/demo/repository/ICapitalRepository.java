package com.manipal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manipal.demo.model.CapitalBean;


@Repository
public interface ICapitalRepository extends JpaRepository<CapitalBean,String>{
	public CapitalBean findByName(String name);
	public CapitalBean findByZipcode(String zipcode);
	public CapitalBean findByCountryCode(String countryCode);
}
