<%@page import="com.briup.bean.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/test3.css">

<title>管理员信息表</title>
</head>
<body bgcolor="">
<%   String account = (String)session.getAttribute("account"); 
     Admin admin = (Admin)session.getAttribute("Admin");
     session.setAttribute("admin", admin);
      //out.println(account);
      //out.println("AFirstLog的Admin值："+admin);
%>
<img  src="images/churuku.png" width="300px" height="75px">
<table cellspacing="1" cellpadding="3" align="center" border="0" width="98%">
		<tr>
		<td width="65%"><BR>
		欢迎您<%=account %>，进入管理员界面！ </td>
		<td width="35%" align="right">
		</td></tr></table>
   
<div class="f2" >

<a href="AInf.jsp?admin=<%=admin%>" ><img  src="images/guanliyuan.png" width="200px" height="200px"></a>
<a href="GoodsInf.jsp?admin=<%=admin%>"><img  src="images/chaxun.png" width="200px" height="200px"></a>
<a href="Goods.jsp?admin=<%=admin%>"><img  src="images/chuku.png" width="200px" height="200px"></a><br>
<a href="AddGoods.jsp?admin=<%=admin%>"><img  src="images/ruku.png" width="140px" height="140px"></a>
<a href="CSInf.jsp?admin=<%=admin%>"><img  src="images/kehu.png" width="140px" height="140px"></a>
<a href="AFirstLog.jsp"><img  src="images/shouye.png" width="140px" height="140px"></a>
<a href="Alogin.jsp"><img  src="images/tuichu.png" width="140px" height="140px"></a>
</div> 
</body>
</html>