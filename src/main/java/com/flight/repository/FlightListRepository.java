package com.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.FlightList;

public interface FlightListRepository extends JpaRepository<FlightList, Integer>{

}
