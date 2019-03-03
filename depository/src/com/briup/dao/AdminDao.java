package com.briup.dao;

import java.util.List;

import com.briup.bean.Admin;

public interface AdminDao {
	//保存用户
	void saveAdmin(Admin admin) throws Exception;
	//更新用户
	void updateAdmin(Admin admin) throws Exception;
	//查找用户
	List<Admin> findAdminByName(String name) throws Exception;
	
	List<Admin> findAdminById(int id) throws Exception;
}
