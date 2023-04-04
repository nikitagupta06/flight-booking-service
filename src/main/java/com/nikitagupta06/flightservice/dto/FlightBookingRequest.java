package com.nikitagupta06.flightservice.dto;

import com.nikitagupta06.flightservice.entity.PassengerInfo;
import com.nikitagupta06.flightservice.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
