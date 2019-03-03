package com.briup.bean;

import java.util.List;

public interface AdminMapper {
	void insertAdmin(Admin a);
	List<Admin> selectAdminByName(String name);
	List<Admin> selectAdminById(int id);
	void updateAdmin(Admin admin);
}
