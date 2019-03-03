package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Admin;
import com.briup.comment.exception.AdminServiceException;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.AdminDao;
import com.briup.dao.impl.AdminDaoImp;
import com.briup.serviceImp.AdminService;
@WebServlet("/AregisterServlet")
public class AregisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   request.setCharacterEncoding("UTF-8");
	   response.setCharacterEncoding("UTF-8");
	   String  account = request.getParameter("userid");
	   String  password = request.getParameter("password");
	   String  name = request.getParameter("name"); 
	   String  sex = request.getParameter("sex");
	   String  age = request.getParameter("age");
	   String  phone = request.getParameter("phone");
	   String  email = request.getParameter("email");
	   String  address = request.getParameter("address");
	   System.out.println("account:"+account);
	   Admin admin = new Admin();
	   admin.setAccount(account);
	   admin.setPassword(password);
	   admin.setName(name);
	   admin.setSex(sex);
	   admin.setAge(age);
	   admin.setPhone(phone);
	   admin.setEmail(email);
	   admin.setAddress(address);
	   AdminService adminService = new AdminService();
	   System.out.println("开始注册！");
	   //AdminDaoImp adminDaoImp = new AdminDaoImp();	
	   SqlSession sqlSession = MybatisSessionFactory.getSession();
	   AdminDaoImp aDaoImp = new AdminDaoImp();
		try {
		List<Admin> fadmin = aDaoImp.findAdminByName(admin.getAccount());
   	      if (fadmin.size()==0) {
			 System.out.println("用户名不存在，ADS开始注册"+fadmin.size());
			 aDaoImp.saveAdmin(admin);
			 sqlSession.commit();
			 //session.close();
			 response.sendRedirect("ARsucess.jsp");
			 throw new AdminServiceException("保存成功！");
			}else{
			  sqlSession.commit();
		     //session.close();
		     for(Admin fAdmin2:fadmin)	
		     {   
			  if(fAdmin2.getAccount()!=null){
				 response.sendRedirect("AregisterFail.jsp");
			}
		  }
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
