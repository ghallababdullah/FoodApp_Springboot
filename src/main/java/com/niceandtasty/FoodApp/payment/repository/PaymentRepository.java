package com.niceandtasty.FoodApp.payment.repository;

import com.niceandtasty.FoodApp.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment , Long> {
}
