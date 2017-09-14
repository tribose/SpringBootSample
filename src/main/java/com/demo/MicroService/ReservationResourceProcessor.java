package com.demo.MicroService;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReservationResourceProcessor implements ResourceProcessor<Resource<Reservation>> {

	public Resource<Reservation> process(Resource<Reservation> reservationResource){
		reservationResource.add(new Link("http://s3.com/images/" + reservationResource.getContent().getId()
				+".jpg", "profile-photo"));
		return reservationResource;
	}
}
