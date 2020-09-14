package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Schedule;

@Repository
public interface IScheduleRepository extends JpaRepository<Schedule,Long>{

}
