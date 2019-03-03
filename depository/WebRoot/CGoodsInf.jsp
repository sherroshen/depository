<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.briup.bean.Goods" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>    
<%@ page import="com.briup.dao.impl.GoodsDaoImp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--文件头开始-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="description" content="仓库信息表">
		<title>库存信息表</title>
		<LINK href="css/main.css" rel=stylesheet>
		<link rel="stylesheet" type="text/css" href="css/test3.css">
		<script language = "JavaScript" src = "js/main.js"></script>
	</head>
	<body onLoad="MM_preloadImages('images/index_on.gif','images/reg_on.gif','images/order_on.gif','../images/top/topxmas/jp_on.gif','../images/top/topxmas/download_on.gif','../images/top/topxmas/bbs_on.gif','../images/top/topxmas/designwz_on.gif')" topmargin="0" leftmargin="0" rightmargin="0" bottommargin="0">
		<div class="">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		      <table width="100" border="0" cellspacing="0" cellpadding="0" align="center">
		         </table>
		    </td>
		  </tr>
		</table>
		<table cellspacing="1" cellpadding="3" align="center" border="0" width="98%">
		</table>
<!--文件体开始-->
          <br>
           <br>
<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		    <td height=25 width="100px" valign=middle bgcolor="#E4F3FF" align="center">
                     <a href="CFirstLog.jsp">返回首页</a>
            </td>
		    <td height=25 valign=middle bgcolor="#E4F3FF" align="center">
                   <b>商品信息库存如下！</b>
            </td>
         </tr>
		</table>
              <br>
<form method="post" name="reg" action="OutStock.jsp">
	<table cellpadding="3" cellspacing="1" align="center" class="tableborder3" id="table1">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" color="#9999FF">
			<font><b></b></font></td>
		</tr>
		<tr>
			<td width="10%" class="tablebody1" align="center"><b>库存编号</b><br>
			</td><td width="10%" class="tablebody1" align="center"><b>商品名称</b>
			</td><td width="10%" class="tablebody1" align="center"><b>商品数量 </b>
			</td><td width="10%" class="tablebody1" align="center"><b>商品编号 </b>
			</td><td width="10%" class="tablebody1" align="center"><b>生产厂商</b>
			</td><td width="10%" class="tablebody1" align="center"><b>商品类别</b>
			</td><td width="10%" class="tablebody1" align="center"><b>商品价格</b>
			</td>
		</tr>
		<%  
		   GoodsDaoImp goodsDaoImp = new GoodsDaoImp();
		   List<Goods> list = goodsDaoImp.findGoods();		  
		   session.setAttribute("list", list);
		   //out.println(list);
		%>
		
		<c:forEach items="${sessionScope.list}" var="goods" begin="0"  varStatus="stusts">
		<tr>    
		   	     <td width="10%" class="tablebody1" align="center">${stusts.index}
			</td><td width="10%" class="tablebody1" align="center">${goods.name}
			</td><td width="10%" class="tablebody1" align="center">${goods.num}
			</td><td width="10%" class="tablebody1" align="center">${goods.goodsid}
			</td><td width="10%" class="tablebody1" align="center">${goods.address}
			</td><td width="10%" class="tablebody1" align="center">${goods.sort}
			</td><td width="10%" class="tablebody1" align="center">${goods.price}
			</td>
		</tr>
		</c:forEach>
			</table>
			
	</div>
</form>

	</body>
</html>