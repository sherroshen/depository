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
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.impl.AdminDaoImp;

/**
 * Servlet implementation class AInfServlet
 */
@WebServlet("/AInfServlet")
public class AInfServlet extends HttpServlet {
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
  	   Admin admin = new Admin();
  	   admin.setAccount(account);
	   admin.setPassword(password);
	   admin.setName(name);
	   admin.setSex(sex);
	   admin.setAge(age);
	   admin.setPhone(phone);
	   admin.setEmail(email);
	   admin.setAddress(address);
	   System.out.println("AInfServlet获取的信息:"+admin);
	   SqlSession sqlSession = MybatisSessionFactory.getSession();
	   HttpSession session = request.getSession();
	   AdminDaoImp aDaoImp = new AdminDaoImp();
		try {
			aDaoImp.updateAdmin(admin);
			sqlSession.commit();
			session.setAttribute("admin", admin);
			response.sendRedirect("AInf.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
