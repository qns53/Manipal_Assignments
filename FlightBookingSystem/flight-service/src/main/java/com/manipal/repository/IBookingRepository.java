package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Booking;



@Repository
public interface IBookingRepository extends JpaRepository<Booking,Long>{

}
