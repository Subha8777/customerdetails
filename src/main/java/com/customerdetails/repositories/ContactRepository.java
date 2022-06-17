package com.customerdetails.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerdetails.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
