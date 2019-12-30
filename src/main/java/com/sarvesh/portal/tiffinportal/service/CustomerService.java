package com.sarvesh.portal.tiffinportal.service;

import java.util.List;

import com.sarvesh.portal.tiffinportal.entity.Customer;

public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int customerId);

	public void saveCustomer(Customer customer);

	public void deleteCustById(int id);

}
