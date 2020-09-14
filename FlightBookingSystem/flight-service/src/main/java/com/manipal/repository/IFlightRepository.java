package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Flight;

@Repository
public interface IFlightRepository extends JpaRepository<Flight,Long>{

}
