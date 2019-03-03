<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仓库客户登录</title>
<link rel="stylesheet" type="text/css" href="css/test3.css">
<script language = "JavaScript" src = "js/main.js"></script>
</head>
<body >
   <div class="di">
   <form method="post" name="Alogin" action="/biyesheji/CloginServlet">
   <table>
    <div class="d0">
      <p align="center">客户登录</p></div>
    <div class="d1">
        <input name="cin_be" value="请输入客户帐号">
      
    </div>
    <div class="d2"> 
           <input name="cpass" value="请输入客户密码">
    </div>
    
     <div class="d4"  >
        <button class="but" type="submit" onclick="javascript:checkMe()">登录</button>  
      </div>
            </table>
      <div class="d5">
                  <span class="hui"></span>
                   您还不是本中心客户请<a href="Cregister.jsp">点击立即注册 </a>  
      </div>

   </div>
   
</body>
</html>