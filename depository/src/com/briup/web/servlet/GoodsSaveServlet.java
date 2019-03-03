package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;
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
 * Servlet implementation class GoodsSaveServlet
 */
@WebServlet("/GoodsSaveServlet")
public class GoodsSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.setCharacterEncoding("UTF-8");
	        response.setCharacterEncoding("UTF-8");
	        String name= request.getParameter("goods"); 
	        String address= request.getParameter("address"); 
	        String goodsid= request.getParameter("goodsid"); 
	        String price= request.getParameter("price"); 
	        String sort= request.getParameter("sort"); 
	        String num= request.getParameter("num"); 
	        Goods goods = new Goods();
	        goods.setGoodsid(goodsid);
	        goods.setName(name);
	        goods.setAddress(address);
	        goods.setPrice(price);
	        goods.setSort(sort);
	        goods.setNum(num);
	        System.out.println("入库名称为："+name+goodsid+address+price+sort+num+goods);
	        SqlSession sqlSession = MybatisSessionFactory.getSession();
	        GoodsDaoImp goodsDaoImp = new GoodsDaoImp();
	        try {
				List<Goods> fGoods = goodsDaoImp.findGoodsByName(name);
				List<Goods> fGoodsid = goodsDaoImp.findGoodsById(goodsid);
				//List<Goods> pGoods = goodsDaoImp.findGoodsByName("铅笔");
				//List<Goods> aGoods = goodsDaoImp.findGoods();
				//System.out.println("铅笔的结果："+pGoods);
				//System.out.println("所有结果："+aGoods);
				if (fGoods.size()==0 && fGoodsid.size()==0) {
					goodsDaoImp.saveGoods(goods);
					sqlSession.commit();
					response.sendRedirect("AddGoods.jsp");
					//session.close();
				}else{
					response.sendRedirect("InStockFail.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
