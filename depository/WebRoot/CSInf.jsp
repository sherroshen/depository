<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.briup.bean.Customer" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.List" %>    
<%@ page import="com.briup.dao.impl.CustomerDaoImp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--文件头开始-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="description" content="顾客信息表">
		<title>所有顾客信息表</title>
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
		   <td height=25 valign=middle bgcolor="#E4F3FF" align="center">
                     <a href="AFirstLog.jsp">返回首页</a>
            </td>
		    <td height=25 valign=middle bgcolor="#E4F3FF" align="center">
                   <b>顾客信息如下！</b>
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
		         <td width="10%" class="tablebody1" align="center"><b>客户编号</b>
			</td><td width="10%" class="tablebody1" align="center"><b>用户名</b><br>
			</td><td width="10%" class="tablebody1" align="center"><b>密码</b>
			</td><td width="10%" class="tablebody1" align="center"><b>姓名 </b>
			</td><td width="10%" class="tablebody1" align="center"><b>性别 </b>
			</td><td width="10%" class="tablebody1" align="center"><b>年龄</b>
			</td><td width="10%" class="tablebody1" align="center"><b>联系方式</b>
			</td><td width="10%" class="tablebody1" align="center"><b>Email地址</b>
			</td><td width="10%" class="tablebody1" align="center"><b>联系地址</b>
			</td><td width="10%" class="tablebody1" align="center"><b>信息修改</b>
			</td>
		</tr>
		<%  
		   CustomerDaoImp customerDaoImp = new CustomerDaoImp();
		   List<Customer> list = customerDaoImp.findAllCustomer();		  
		   session.setAttribute("list", list);
		   //out.println(list);
		%>
		
		<c:forEach items="${sessionScope.list}" var="customer" begin="0"  varStatus="stusts">
		<tr>    
		   	     <td width="10%" class="tablebody1" align="center">${stusts.index}
			</td><td width="10%" class="tablebody1" align="center">${customer.account}
			</td><td width="10%" class="tablebody1" align="center">${customer.password}
			</td><td width="10%" class="tablebody1" align="center">${customer.name}
			</td><td width="10%" class="tablebody1" align="center">${customer.sex}
			</td><td width="10%" class="tablebody1" align="center">${customer.age}
			</td><td width="10%" class="tablebody1" align="center">${customer.phone}
			</td><td width="10%" class="tablebody1" align="center">${customer.email}
			</td><td width="10%" class="tablebody1" align="center">${customer.address}
			</td><td width="15%" class="tablebody1" align="center">
			<a href="ACInf.jsp?account=${customer.account}">修改</a>
			</td>
		</tr>
		</c:forEach>
			</table>
			
	</div>
</form>

	</body>
</html>