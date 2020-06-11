package com.anam.sona.build.customerdetails.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anam.sona.build.customerdetails.GetCustomerDetailsService;
import com.anam.sona.build.customerdetails.exceptions.NoCustomersException;
import com.anam.sona.build.customerdetails.models.Customer;
import com.anam.sona.build.customerdetails.service.ServiceImpl;
		 		
@RestController
public class Controller {
	
	
	@Autowired
	ServiceImpl serviceObject;

	Logger logger = LoggerFactory.getLogger(GetCustomerDetailsService.class);

	
	
	@GetMapping("/customer/{custId}")
	public Customer getCustomerDetails(@PathVariable Integer custId) {
		String msg = "Fetching Customer details by customer Id...";
		logger.info(msg);
		return serviceObject.getCustomerDetails(custId);
	}
	
	
	@GetMapping("/customers")
	public ArrayList<Customer> getAllCustomers() throws NoCustomersException {
		String msg = "Fetching All Customers Details...";
		logger.info(msg);
		return serviceObject.getAllCustomers();
	}

}
