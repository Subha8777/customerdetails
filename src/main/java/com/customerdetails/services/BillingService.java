package com.customerdetails.services;

import java.util.List;

import com.customerdetails.entities.Billing;
import com.customerdetails.entities.Contact;

public interface BillingService {

	public void saveBill(Billing bill);
	
	public List<Billing> getAllBills();
}
