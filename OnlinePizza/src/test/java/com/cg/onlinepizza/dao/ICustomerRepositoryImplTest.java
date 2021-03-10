package com.cg.onlinepizza.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.onlinepizza.entities.Customer;



class ICustomerRepositoryImplTest {
	
	private ICustomerRepository repo;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		repo =  new ICustomerRepositoryImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	/*
	 * @Test void Addcustomer() { Customer c1 =new
	 * Customer(2,"Vandu",9810830597l,"neha@gmail.com","Laxminagar","Neha_Saxena",
	 * "12345678"); Customer c2=new
	 * Customer(2,"Vandu",9810830597l,"neha@gmail.com","Laxminagar","Neha_Saxena",
	 * "12345678"); repo.addCustomer(c1);
	 * 
	 * assertEquals(c1.getCustomerName(),c2.getCustomerName(),()-
	 * >"Object should return the same name");
	 * 
	 * }
	 */
	 
	 
	  
	
	  @Test void UpdateCustomer() {
	  
	  Customer c2=new Customer(2,"Neha",9810830597l,"neha@gmail.com","Laxminagar","Neha_Saxena123","12345678"); 
	  repo.updateCustomer(c2);
	  
	  assertEquals("Neha",c2.getCustomerName(),()->"Object should return the same name");
	  
	  }
	 
	 
	  
	  
	/*
	 * @Test void DelCustomer() throws CustomerIdNotFoundException { Integer id=2;
	 * Customer customerdeleted= repo.deleteCustomer(id);
	 * assertNull(customerdeleted);
	 * 
	 * }
	 */
	  
	  @Test
	  void ListCustomer()
	  {
		 
		 
		 
	  }
	  
	 
}
