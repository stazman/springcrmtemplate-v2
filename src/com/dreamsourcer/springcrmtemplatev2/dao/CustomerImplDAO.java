package com.dreamsourcer.springcrmtemplatev2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dreamsourcer.springcrmtemplatev2.entity.Customer;

@Repository
public class CustomerImplDAO implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {

		Session currSess = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = currSess.createQuery("from Customer", Customer.class);
		
		List<Customer> allCustomers = theQuery.getResultList();
	
		return allCustomers;
		
	}


	@Override
	public void saveCustomer(Customer theCustomer) {

		Session currSess = sessionFactory.getCurrentSession();
		
		currSess.save(theCustomer);

	}
	
}
