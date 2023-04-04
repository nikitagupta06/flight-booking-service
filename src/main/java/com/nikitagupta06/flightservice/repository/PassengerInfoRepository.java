package com.nikitagupta06.flightservice.repository;

import com.nikitagupta06.flightservice.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
