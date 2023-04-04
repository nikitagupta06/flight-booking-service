package com.nikitagupta06.flightservice.service;

import com.nikitagupta06.flightservice.dto.FlightBookingAcknowledgement;
import com.nikitagupta06.flightservice.dto.FlightBookingRequest;
import com.nikitagupta06.flightservice.entity.PassengerInfo;
import com.nikitagupta06.flightservice.entity.PaymentInfo;
import com.nikitagupta06.flightservice.repository.PassengerInfoRepository;
import com.nikitagupta06.flightservice.repository.PaymentInfoRepository;
import com.nikitagupta06.flightservice.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        paymentInfo = paymentInfoRepository.save(paymentInfo);

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());

        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS",
                passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],
                passengerInfo);
    }
}
