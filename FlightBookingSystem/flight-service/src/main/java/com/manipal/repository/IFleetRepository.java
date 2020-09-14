package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Fleet;

@Repository
public interface IFleetRepository extends JpaRepository<Fleet,Long>{

}
