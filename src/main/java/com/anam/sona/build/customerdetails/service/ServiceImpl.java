package com.anam.sona.build.customerdetails.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anam.sona.build.customerdetails.dao.DAOImpl;
import com.anam.sona.build.customerdetails.exceptions.NoCustomersException;
import com.anam.sona.build.customerdetails.models.Customer;

@Service
@Transactional
public class ServiceImpl implements ServiceClass {
	
	@Autowired
	private DAOImpl daoObject;
	
	@Override
	public Customer getCustomerDetails(Integer custId) {
		return daoObject.getCustomerDetails(custId);
	}
	
	@Override	
	public ArrayList<Customer> getAllCustomers() throws NoCustomersException {
		ArrayList<Customer> customers = (ArrayList<Customer>) daoObject.getAllCustomers();

		return customers;
	}
	

}
