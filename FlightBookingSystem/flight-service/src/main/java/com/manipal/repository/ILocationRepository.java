package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location,Long>{

}
