package com.flight.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.flight.entity.BookedTicket;
import com.flight.entity.FlightList;
import com.flight.models.SearchFlight;
import com.flight.repository.BookedTicketRepository;
import com.flight.repository.FlightListRepository;

@Service
public class FlightListService {
	@Autowired
	private FlightListRepository flightListRepository;
	
	@Autowired
	private BookedTicketRepository bookedTicketRepository;

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
	
//	Block And Unblock The Flight
	
	public FlightList blockFlight(int id) {
		FlightList flightList = this.flightListRepository.findById(id).get();
		flightList.setBlock(true);
		return flightListRepository.save(flightList);
//		System.out.println(flightList.getAirlineName()+" "+ flightList.isBlock() +"indiawale");
//		return null;
		
	}
//	Block And Unblock The Flight
	
	public FlightList unBlockFlight(int id) {
		FlightList flightList = this.flightListRepository.findById(id).get();
		flightList.setBlock(false);
		return flightListRepository.save(flightList);
//		System.out.println(flightList.getAirlineName()+" "+ flightList.isBlock() +"indiawale");
//		return null;
		
	}
	
	//Editing FLight
	
	public FlightList editFlight(int id, FlightList flightList){
		FlightList list = this.flightListRepository.findById(id).get();
		list.setAirlineName(flightList.getAirlineName());
		list.setArrivalTime(flightList.getArrivalTime());
		list.setDepartureTime(flightList.getDepartureTime());
		list.setFromLocation(flightList.getFromLocation());
		list.setTicketCost(flightList.getTicketCost());
		list.setToLocation(flightList.getToLocation());
		list.setTotalSeats(flightList.getTotalSeats());
		list.setBlock(flightList.isBlock());
		return this.flightListRepository.save(list);
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	//searching flight
	
	public List<FlightList> searchFlight(String fromLocation, String  toLocation){
		return this.flightListRepository.findByLocation(fromLocation, toLocation);
	}
	
	public FlightList getFlightById(int id) {
		return this.flightListRepository.findById(id).get();
	}
	
	public BookedTicket saveTicketHistory(BookedTicket bookedTicket) {
		return this.bookedTicketRepository.save(bookedTicket);
	}
	
	public List<BookedTicket> getTicketHistory(int id) {
		return this.bookedTicketRepository.findAllById(id);
	}
}
