package com.nikitagupta06.flightservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FlightServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlightServiceApplication.class, args);
	}

}
