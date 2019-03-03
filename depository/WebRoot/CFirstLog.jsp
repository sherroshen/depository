<%@page import="com.briup.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/test3.css">
<title>客户信息表</title>
</head>
<body bgcolor="">
<%   String caccount = (String)   session.getAttribute("caccount"); 
     Customer customer = (Customer) session.getAttribute("customer");
     // out.println(customer);
      //out.println(caccount);
%>
<img  src="images/churuku.png" width="300px" height="75px">
<table cellspacing="1" cellpadding="3" align="center" border="0" width="98%">
		<tr>
		<td  align="right">
		
		</td></tr>
		<tr>
		<td width="65%"><BR>
		尊敬的<%=caccount %>，您好！ <br> </td>
		</tr></table>
<div class="f2" align="center">
   <a href="CInf.jsp?customer=<%=customer%>"><img  src="images/guanliyuan.png" width="150px" height="150px"></a>  
   <a href="CGoodsInf.jsp?customer=<%=customer%>"><img  src="images/chaxun.png" width="150px" height="150px"></a> 
   <a href="Clogin.jsp"><img  src="images/tuichu.png" width="150px" height="150px"></a>
</div>
</body>
</html>