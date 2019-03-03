package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Admin;
import com.briup.comment.exception.AdminServiceException;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.AdminDao;
import com.briup.dao.impl.AdminDaoImp;
import com.briup.serviceImp.AdminService;

@WebServlet("/AloginServlet")
public class AloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
    boolean find=false;
	String  account  = request.getParameter("in_be");
	String  password = request.getParameter("pass");
	HttpSession session = request.getSession();
	session.setAttribute("account", account);
	//System.out.println("账户为："+account);
	//System.out.println("密码为："+password);
	AdminService adminService = new AdminService();
	SqlSession sqlSession = MybatisSessionFactory.getSession();
	AdminDaoImp aDaoImp = new AdminDaoImp();
		try {
		   List<Admin> fadmin = aDaoImp.findAdminByName(account);
		    sqlSession.clearCache();
		    sqlSession.commit();
		//session.close();
		
		System.out.println("用户名不存在，ADS开始注册"+fadmin);
        for(Admin fAdmin2:fadmin)	
        {   
	      if( password.equals(fAdmin2.getPassword()))
	      {
		      response.sendRedirect("AFirstLog.jsp");
		      session.setAttribute("Admin", fAdmin2);
		      //System.out.println("帐号密码正确！");
	          find=true;
		  }
        }
		 if (fadmin.size()==0) {
			 System.out.println("用户名不存在，ADS开始注册"+fadmin);
			 response.sendRedirect("AloginFail.html");
			 throw new AdminServiceException("用户名不存在！");
			}
		 else {
			 if(find==false){
				 response.sendRedirect("AloginFail.html");
				 throw new AdminServiceException("密码错误！");
			 }
		       }
			   
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
