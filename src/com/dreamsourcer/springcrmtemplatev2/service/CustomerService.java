package com.dreamsourcer.springcrmtemplatev2.service;

import java.util.List;

import com.dreamsourcer.springcrmtemplatev2.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

}
