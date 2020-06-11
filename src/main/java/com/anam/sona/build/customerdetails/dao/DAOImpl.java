package com.anam.sona.build.customerdetails.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anam.sona.build.customerdetails.models.Customer;

@Repository
public class DAOImpl implements DAO {
	

	@Autowired
	private EntityManager em;

	public DAOImpl() {
	}	

	@Override
	public Customer getCustomerDetails(Integer custId) {
		Customer customer = em.find(Customer.class, custId);
		return customer;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
	    TypedQuery<Customer> query = em. createNamedQuery(Customer.FIND_ALL, Customer.class);
	    return query.getResultList();
	}
/*	
	@Override
	public List<Customer> getAllCustomers() throws NoCustomersException {
		
		String query = "select * from Customer";
		TypedQuery<Customer> q = em.createQuery(query, Customer.class);	
		List<Customer> customers;
		
		try {
			customers =  q.getResultList();
		}
		catch (NoResultException e) {
			customers = null;
		}
		if(customers == null)
		{
			throw new NoCustomersException("We don't have any customers yet!");
		}
		
		return customers;
		
	}
	*/
}
