package com.customerdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customerdetails.entities.Billing;
import com.customerdetails.entities.Contact;
import com.customerdetails.services.BillingService;
import com.customerdetails.services.ContactService;

@Controller
public class BillingController {

	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("bid")  long id, ModelMap model) {
		
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact",contact);
		return "create_bill";
	}
	@RequestMapping("/saveBill")
	 public String saveBill(@ModelAttribute("bill") Billing bill) {
		 
		 billingService.saveBill(bill);
		 return "create_bill";
	 }
	
	
	
	@RequestMapping("/listAllBills")
	 public String listAllBills(ModelMap model) {
		 List<Billing> bills = billingService.getAllBills();
			model.addAttribute("bills", bills)	;
		 
		 return "billing_search_result";
	 }
	
	
	
}
