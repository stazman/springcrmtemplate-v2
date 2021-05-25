package com.dreamsourcer.springcrmtemplatev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dreamsourcer.springcrmtemplatev2.dao.CustomerDAO;
import com.dreamsourcer.springcrmtemplatev2.entity.Customer;


@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/list")
	public String listCustomers (Model model){
		
		List<Customer> customerList = customerDAO.getCustomers();
		
		model.addAttribute("customers", customerList);
		
		return "list-customer";
		
	}
	
}
