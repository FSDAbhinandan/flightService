package com.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight.entity.FlightList;

public interface FlightListRepository extends JpaRepository<FlightList, Integer>{
	
	@Query(value="SELECT * FROM flightlist u where u.from_location= :fromLocation AND  u.to_location= :toLocation", nativeQuery = true)
	List<FlightList> findByLocation(@Param("fromLocation") String fromLocation, @Param("toLocation") String toLocation);

}
