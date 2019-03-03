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

import com.briup.bean.Goods;
import com.briup.common.MybatisSessionFactory;
import com.briup.dao.impl.GoodsDaoImp;

/**
 * Servlet implementation class InOldGoodsServlet
 */
@WebServlet("/InOldGoodsServlet")
public class InOldGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	      response.setCharacterEncoding("UTF-8");
	      HttpSession  session = request.getSession();
	      SqlSession sqlSession = MybatisSessionFactory.getSession();
	      List<Goods> goods =  (List<Goods>) session.getAttribute("goodslist"); 
	      System.out.println("session:"+session.getAttribute("goodsid"));
	      System.out.println("OutGoodsServlet:"+session.getAttribute("goodslist"));
	      //System.out.println("货物数量"+((Goods) goods).getNum());
	      System.out.println("goods : " + goods);
	      String InNum =  request.getParameter("Innum");
	      Integer IntInNum = Integer.valueOf(InNum);
	      System.out.println("IntOutNum:"+IntInNum);
	      //System.out.println("OutNum : " + OutNum);
	      GoodsDaoImp goodsDaoImp = new GoodsDaoImp();
	      for(Goods goods2:goods){
	    	  String GoodsNum =  goods2.getNum();
	    	  System.out.println("goods2值为:"+goods2);
	    	  Integer IntGoodsNum = Integer.valueOf(GoodsNum);
	    	  System.out.println("IntGoodsNum :"+IntGoodsNum);
	    	  if (IntInNum<0) {
	    		 System.out.println("入库数量不足！");
				response.sendRedirect("AddGoodsFail.jsp");
			   }else{
				goods2.setNum(String.valueOf(IntGoodsNum+IntInNum));
				try {
					goodsDaoImp.updateGoods(goods2);
					sqlSession.commit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.sendRedirect("AddGoods.jsp"); 
				System.out.println("入库成功！");
			   }  
	      }   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
