package com.cg.onlinepizza.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.onlinepizza.entities.Customer;
import com.cg.onlinepizza.exceptions.CustomerIdNotFoundException;

public class ICustomerRepositoryImpl implements ICustomerRepository {
	EntityManagerFactory factory =  Persistence.createEntityManagerFactory("test1");
	EntityManager em  =  factory.createEntityManager();

	@Override
	public Customer addCustomer(Customer customer) {
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		int id=customer.getCustomerId();
		em.getTransaction().begin();
		em.createQuery("UPDATE Customer set customerAddress = :p , customerName= :q , customerMobile= :r WHERE id= :s" ).setParameter("p", customer.getCustomerAddress()).setParameter("q", customer.getCustomerName()).setParameter("r", customer.getCustomerMobile()).setParameter("s", id);
		em.getTransaction().commit();
		
		return customer;
		
		
		
		
	}

	@Override
	public Customer deleteCustomer(int customerId) throws CustomerIdNotFoundException {
		Customer customer=em.find(Customer.class,customerId);
		em.getTransaction().begin();
		em.remove(customer);
		em.getTransaction().commit();
		Customer customer1=em.find(Customer.class,customerId);
		
		return customer1;
		
	}

	@Override
	public List<Customer> viewCustomers() {
		Query query = em.createQuery("from Product", Customer.class);
	    List<Customer> resultList = query.getResultList();
	    
	    return resultList;
	}

	@Override
	public Customer viewCustomer(int customerId) throws CustomerIdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
