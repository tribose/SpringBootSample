package com.demo.MicroService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationRestController {

	private ReservationRepository repository;
	
	@Autowired
	public ReservationRestController(ReservationRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping("/reservations")
	Collection<Reservation> getReservations(){
		return this.repository.findAll();
	}
}
