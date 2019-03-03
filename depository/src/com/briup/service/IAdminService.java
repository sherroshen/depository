package com.briup.service;

import com.briup.bean.Admin;
import com.briup.bean.Customer;
import com.briup.comment.exception.AdminServiceException;


public interface IAdminService {
	void register(Admin admin) throws AdminServiceException; 
	Admin longin(String account,String password) throws AdminServiceException;
}
