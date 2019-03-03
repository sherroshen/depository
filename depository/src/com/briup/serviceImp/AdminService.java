package com.briup.serviceImp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Admin;
import com.briup.comment.exception.AdminServiceException;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.impl.AdminDaoImp;
import com.briup.service.IAdminService;
import com.briup.web.servlet.AregisterServlet;

public class AdminService implements IAdminService{

	@Override
	public void register(Admin admin) throws AdminServiceException {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		AdminDaoImp aDaoImp = new AdminDaoImp();
		try {
		List<Admin> fadmin = aDaoImp.findAdminByName(admin.getAccount());
    	if (fadmin.size()==0) {
			//System.out.println("用户名不存在，ADS开始注册"+fadmin.size());
			 aDaoImp.saveAdmin(admin);
			 session.commit();
			 session.close();
			 throw new AdminServiceException("保存成功！");
			}else{
			 session.commit();
		     session.close();
		   for(Admin fAdmin2:fadmin)	
		  {   
			//System.out.println("fAdminAccount的值为:"+fAdmin2);
			if(fAdmin2.getAccount()!=null){
				//System.out.println("ADS用户名存在，重新注册！");
				throw new AdminServiceException("用户名存在");
			}
		  }
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Admin longin(String account, String password) throws AdminServiceException {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSessionFactory.getSession();
		AdminDaoImp aDaoImp = new AdminDaoImp();
		try {
			List<Admin> fadmin = aDaoImp.findAdminByName(account);
			for(Admin fAdmin2:fadmin)
			{
				if(fAdmin2.getAccount()==null){
				throw new AdminServiceException("用户名不存在");
				}else{
				if(fAdmin2.getPassword().equals(password)){
					throw new AdminServiceException("密码错误！");
				}
			}	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}

}
