package com.flight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.BookedTicket;
import com.flight.entity.FlightList;
import com.flight.models.SearchFlight;
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
	
//	Block The Flight
	
	@PutMapping("/flights/{id}/block")
	public FlightList blockFlight(@PathVariable("id") int id) {
		System.out.println("Inside Flight");
	  return this.flightListService.blockFlight(id);
	}
//UnBlock The Flight
	
	@PutMapping("/flights/{id}/unblock")
	public FlightList unBlockFlight(@PathVariable("id") int id) {
		System.out.println("Inside Flight");
		return this.flightListService.unBlockFlight(id);
	}
	//Editing Flight
	@PutMapping("/flights/{id}/edit")
	public FlightList editFlight(@PathVariable("id") int id, @RequestBody FlightList flightList) {
		return this.flightListService.editFlight(id, flightList);
	}
	
	
	
	///////////////////////////////////////////////////////////////////////
	
	//searching flight
	@CrossOrigin("*")
	@PostMapping("/search")
	public List<FlightList> searchFlight(@RequestBody SearchFlight searchFlight){
		return this.flightListService.searchFlight(searchFlight.getFromLocation(),searchFlight.getToLocation());
	}
	
	@CrossOrigin("*")
	@GetMapping("/flightById/{id}")
	public FlightList getFlightById(@PathVariable("id") int id) {
		return this.flightListService.getFlightById(id);
	}
	@CrossOrigin("*")
	@PostMapping("/bookedticket")
	public BookedTicket saveTicketHistory(@RequestBody BookedTicket bookedTicket) {
		return this.flightListService.saveTicketHistory(bookedTicket);
	}
	@CrossOrigin("*")
	@GetMapping("/tickethistory/{id}")
	public List<BookedTicket> getTicketHistory(@PathVariable("id") int id) {
		return this.flightListService.getTicketHistory(id);
	}
}
