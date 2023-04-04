package com.nikitagupta06.flightservice.dto;

import com.nikitagupta06.flightservice.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private Double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;

}
