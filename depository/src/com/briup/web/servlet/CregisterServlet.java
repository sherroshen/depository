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
import com.briup.bean.Customer;
import com.briup.comment.exception.AdminServiceException;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.impl.CustomerDaoImp;


@WebServlet("/CregisterServlet")
public class CregisterServlet extends HttpServlet {
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
		   System.out.println("客户账户"+account);
		   Customer customer = new Customer();
		   customer.setAccount(account);
		   customer.setPassword(password);
		   customer.setName(name);
		   customer.setSex(sex);
		   customer.setAge(age);
		   customer.setPhone(phone);
		   customer.setEmail(email);
		   customer.setAddress(address);
		   System.out.println("账户为："+customer.getAccount());
		   //customer.toString();
		   CustomerDaoImp customerDao = new CustomerDaoImp();
		   SqlSession sqlSession = MybatisSessionFactory.getSession();
		   try {
				List<Customer> fCustomers = customerDao.findCustomerByName(account);
		   	      if (fCustomers.size()==0) {
					 System.out.println("用户名不存在，ADS开始注册"+fCustomers.size());
					 customerDao.saveCustomer(customer);;
					 sqlSession.commit();
					 //sqlSession.close();
					 response.sendRedirect("ARsucess.jsp");
					 throw new AdminServiceException("保存成功！");
					}else{
						sqlSession.commit();
				     //session.close();
				     for(Customer fAdmin2:fCustomers)	
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
