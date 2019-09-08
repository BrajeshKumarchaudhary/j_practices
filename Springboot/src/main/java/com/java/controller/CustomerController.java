package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Customer;
import com.java.repository.CustomerRepository;
@RestController
public class CustomerController {
     
	 @Autowired
	private CustomerRepository repository;
	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<Customer> customers)
	{
		repository.save(customers);
		return customers.size();
	}
	@GetMapping("/findAllCustomers")
	public int  findAllCustomers()
	{ 
		return 0;
		
	}
	
}
