package com.flight.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.entity.FlightList;
import com.flight.repository.FlightListRepository;

@Service
public class FlightListService {
	@Autowired
	private FlightListRepository flightListRepository;

	public List<FlightList> getAllFlights(){
		return this.flightListRepository.findAll();
	}
	
	//adding flights
	
	public FlightList saveFlight(FlightList flightList) {
		return this.flightListRepository.save(flightList);
	}
	
	//deleting Flight
	
	public void deleteFlight(int id) {
		this.flightListRepository.deleteById(id);
	}
}
