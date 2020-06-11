package com.anam.sona.build.customerdetails.service;

import java.util.ArrayList;

import com.anam.sona.build.customerdetails.exceptions.NoCustomersException;
import com.anam.sona.build.customerdetails.models.Customer;

public interface ServiceClass {
	
	Customer getCustomerDetails(Integer custId);
	
	public ArrayList<Customer> getAllCustomers() throws NoCustomersException;

}
