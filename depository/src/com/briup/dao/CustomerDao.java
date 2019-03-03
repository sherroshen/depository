package com.briup.dao;

import java.util.List;

import com.briup.bean.Customer;

public interface CustomerDao {
	//保存用户
		void saveCustomer(Customer customer) throws Exception;
		//更新用户
		void updateCustomer(Customer customer) throws Exception;
		//查找用户
		List<Customer> findCustomerByName(String name) throws Exception;
		
		List<Customer> findCustomerById(int id) throws Exception;
		
		List<Customer> findAllCustomer() throws Exception;
		
		void deleteCustomer(Customer customer) throws Exception;
}
