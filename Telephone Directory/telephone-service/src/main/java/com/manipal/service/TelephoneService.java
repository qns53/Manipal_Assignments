package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.exception.TelephoneNotFoundException;
import com.manipal.model.Telephone;
import com.manipal.repository.ITelephoneRepository;


@Service
public class TelephoneService implements ITelephoneService{
	@Autowired
	private ITelephoneRepository repository;
	
	

	@Override
	public List<Telephone> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Telephone getTelById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public Telephone getTelByNo(long no) {
		// TODO Auto-generated method stub
		return repository.findByTelephoneNo(no);
	}

	@Override
	public String addOrUpdate(Telephone tel) {
		// TODO Auto-generated method stub
		
			repository.save(tel);
		
	
		
		return "Successfully Added";
	}

	@Override
	public void delTel(long id) {
		// TODO Auto-generated method stub
		
		Telephone t=repository.findById(id).orElse(null);
		if(t==null)throw new TelephoneNotFoundException("Telephone Id Not Found");
		repository.deleteById(id);
	}
}
