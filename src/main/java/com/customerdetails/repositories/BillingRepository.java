package com.customerdetails.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerdetails.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
