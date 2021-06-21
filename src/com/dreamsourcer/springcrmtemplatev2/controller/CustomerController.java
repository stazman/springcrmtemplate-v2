package com.dreamsourcer.springcrmtemplatev2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dreamsourcer.springcrmtemplatev2.entity.Customer;
import com.dreamsourcer.springcrmtemplatev2.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers (Model model){
		
		List<Customer> customerList = customerService.getCustomers();
		
		model.addAttribute("customers", customerList);
		
		return "list-customer";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd (Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customers/list";
		
	}
	
}
