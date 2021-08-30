package com.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight.entity.BookedTicket;

public interface BookedTicketRepository extends JpaRepository<BookedTicket, Integer> {

	@Query(value="SELECT * FROM booked_ticket u where u.user_id= :id", nativeQuery = true)
	List<BookedTicket> findAllById(@Param("id") int id);

}
