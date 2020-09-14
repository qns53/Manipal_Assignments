package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Status;

@Repository
public interface IStatusRepository extends JpaRepository<Status,Long>{

}
