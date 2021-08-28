package com.flight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.FlightList;
import com.flight.services.FlightListService;

@RestController
@CrossOrigin("*")
public class FlightFlightListController {
	
	@Autowired
	private FlightListService flightListService;

	@GetMapping("/flights")
	public List<FlightList> getAllFlights(){
		return this.flightListService.getAllFlights();
	}
	
	//adding flights
	
	@PostMapping("/flights")
	public FlightList saveFlight(@RequestBody FlightList flightList) {
		return this.flightListService.saveFlight(flightList);
	}
	
	//Deleting FlightBy Id
	
	@DeleteMapping("/flights/{id}")
	public void deleteFlight(@PathVariable("id") int id) {
		this.flightListService.deleteFlight(id);
	}
}
