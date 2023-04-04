package com.nikitagupta06.flightservice.repository;

import com.nikitagupta06.flightservice.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
