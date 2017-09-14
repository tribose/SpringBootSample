package com.demo.MicroService;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleSpringBootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
		System.out.println("Hello SampleSpringBootApplication");
	}
	
	@Bean
	CommandLineRunner runner( ReservationRepository rr){
		return args -> {
			Arrays.asList("Shatabdi, Duronto, Rajdhani, Hamsafar, Jagannath".split(","))
			.forEach(n -> rr.save(new Reservation(n.trim())));
			
			rr.findAll().forEach(System.out :: println);
			
			rr.findByReservationName("Duronto").forEach(System.out :: println);
		};
		
		
	}
} 
