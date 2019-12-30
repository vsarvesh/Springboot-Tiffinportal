package com.sarvesh.portal.tiffinportal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sarvesh.portal.tiffinportal.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	private EntityManager entityManager;

	@Autowired
	public CustomerDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Customer> findAll() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

		// execute query and get result set
		List<Customer> customers = query.getResultList();

		// return the result set
		return customers;
	}

	@Override
	public Customer findById(int customerId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// get the customer
		Customer customer = currentSession.get(Customer.class, customerId);

		// return the customer
		return customer;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// save the customer
		// if the id=0, then save/insert else update
		currentSession.saveOrUpdate(customer);

	}

	@Override
	public void deleteCustById(int custId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		//delete the object with primary key
		Query query = currentSession.createQuery("delete from Customer where id =:customerId");
		query.setParameter("customerId", custId);
		query.executeUpdate();

	}

}
