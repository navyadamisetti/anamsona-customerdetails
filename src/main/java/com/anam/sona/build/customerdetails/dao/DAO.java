package com.anam.sona.build.customerdetails.dao;

import java.util.List;

import com.anam.sona.build.customerdetails.exceptions.NoCustomersException;
import com.anam.sona.build.customerdetails.models.Customer;

public interface DAO {
	
	Customer getCustomerDetails(Integer custId);
	
	List<Customer> getAllCustomers() throws NoCustomersException;

}
