package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Admin;
import com.briup.bean.Customer;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.impl.AdminDaoImp;
import com.briup.dao.impl.CustomerDaoImp;

/**
 * Servlet implementation class CInfServlet
 */
@WebServlet("/CInfServlet")
public class CInfServlet extends HttpServlet {
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
	  	   Customer customer = new Customer();
	  	   customer.setAccount(account);
	  	   customer.setPassword(password);
	  	   customer.setName(name);
	  	   customer.setSex(sex);
	  	   customer.setAge(age);
	  	   customer.setPhone(phone);
	  	   customer.setEmail(email);
	  	   customer.setAddress(address);
		   System.out.println("AInfServlet获取的信息:"+customer);
		   SqlSession sqlSession = MybatisSessionFactory.getSession();
		   HttpSession session = request.getSession();
		   CustomerDaoImp customerDaoImp = new CustomerDaoImp();
			try {
				customerDaoImp.updateCustomer(customer);
				sqlSession.commit();
				//response.sendRedirect("ACInf.jsp");
				session.setAttribute("customer",customer);
				response.sendRedirect("CInf.jsp");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// session.setAttribute("customer",customer);
			// response.sendRedirect("CInf.jsp");
			   
      
    
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
