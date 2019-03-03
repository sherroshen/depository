package com.briup.bean;

import java.util.List;

public interface CustomerMapper {
	void insertCustomer(Customer customer);
	List<Customer> selectCustomerByName(String name);
	List<Customer> selectCustomerById(int id);
	List<Customer> selectAllCustomer();
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
}
