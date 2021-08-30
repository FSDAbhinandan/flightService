package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookedTicket")
public class BookedTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookedTicketId;
	private int PNR = 12345;
	private int airlineId;
	private String airlineName;
	private String arrivalTime;
	private boolean block;
	private Long contact;
	private String departureTime;
	private  String email;
	private String fromLocation;
	private int seats;
	private int ticketCost;
	private String toLocation;
	private int totalSeats;
	private int userId;
	private String username;
	public BookedTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookedTicket(int bookedTicketId, int pNR, int airlineId, String airlineName, String arrivalTime,
			boolean block, Long contact, String departureTime, String email, String fromLocation, int seats,
			int ticketCost, String toLocation, int totalSeats, int userId, String username) {
		super();
		this.bookedTicketId = bookedTicketId;
		PNR = pNR;
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.arrivalTime = arrivalTime;
		this.block = block;
		this.contact = contact;
		this.departureTime = departureTime;
		this.email = email;
		this.fromLocation = fromLocation;
		this.seats = seats;
		this.ticketCost = ticketCost;
		this.toLocation = toLocation;
		this.totalSeats = totalSeats;
		this.userId = userId;
		this.username = username;
	}
	public int getBookedTicketId() {
		return bookedTicketId;
	}
	public void setBookedTicketId(int bookedTicketId) {
		this.bookedTicketId = bookedTicketId;
	}
	public int getPNR() {
		return PNR;
	}
	public void setPNR(int pNR) {
		PNR = pNR;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
