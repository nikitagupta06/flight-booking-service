package com.nikitagupta06.flightservice.controller;

import com.nikitagupta06.flightservice.dto.FlightBookingAcknowledgement;
import com.nikitagupta06.flightservice.dto.FlightBookingRequest;
import com.nikitagupta06.flightservice.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookFlightTicket")
public class FlightBookingController {

    @Autowired
    private FlightBookingService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return service.bookFlightTicket(request);
    }
}
