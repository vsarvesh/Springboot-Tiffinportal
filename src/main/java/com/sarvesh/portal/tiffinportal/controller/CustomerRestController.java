package com.sarvesh.portal.tiffinportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarvesh.portal.tiffinportal.entity.Customer;
import com.sarvesh.portal.tiffinportal.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	private CustomerService customerService;

	@Autowired
	public CustomerRestController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	@GetMapping("/customers/{id}")
	public Customer findById(@PathVariable(name = "id") int customerId) throws Exception {
		Customer customer = customerService.findById(customerId);
		/*if (customer == null) {
			throw new Exception("Customer id not found: " + customerId);
		}*/
		return customer;
	}

	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		customerService.saveCustomer(customer);
		return customer;
	}

	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}

	@DeleteMapping("customers/{id}")
	public String deleteCustById(@PathVariable(name = "id") int custId) {
		Customer customer = customerService.findById(custId);
		if (customer == null) {
			throw new RuntimeException("Customer id not found: " + custId);
		}

		customerService.deleteCustById(custId);

		return "Customer id deleted: " + custId;
	}

}
