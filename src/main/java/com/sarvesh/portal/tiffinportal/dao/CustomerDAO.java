package com.sarvesh.portal.tiffinportal.dao;

import java.util.List;

import com.sarvesh.portal.tiffinportal.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> findAll();

	public Customer findById(int customerId);

	public void saveCustomer(Customer customer);

	public void deleteCustById(int id);

}
