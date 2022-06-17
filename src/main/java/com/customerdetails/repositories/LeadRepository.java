package com.customerdetails.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerdetails.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
