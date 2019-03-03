package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Goods;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.impl.GoodsDaoImp;

/**
 * Servlet implementation class TestGoodsServlet
 */
@WebServlet("/TestGoodsServlet")
public class TestGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       request.setCharacterEncoding("UTF-8");
	       response.setCharacterEncoding("UTF-8");
	       Goods goods = new Goods();
	       goods.setId(8);
	       goods.setName("铅笔");
	       goods.setNum("45");
	       goods.setPrice("2");
	       goods.setSort("学习用品");
	       goods.setGoodsid("223421");
	       goods.setAddress("2B");
	       System.out.println("goods:"+goods);
	       GoodsDaoImp goodsDaoImp = new GoodsDaoImp();
	       SqlSession sqlSession = MybatisSessionFactory.getSession();
	       try {
	    	System.out.println("开始更新！");
			goodsDaoImp.updateGoods(goods);
			System.out.println("更新完成！");
			sqlSession.commit();
			System.out.println("更新提交！");
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
