<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--文件头开始-->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="description" content="入库表单">
		<title>入库表单</title>
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
<table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
		<tr>
		<td height=25 valign=middle bgcolor="#E4F3FF" align="center">
                                      <b>请输入所要添加商品信息！</b></td>
                </tr>
		</table>
              <br>
<form method="post" name="reg" action="/biyesheji/GoodsSaveServlet">
	<table cellpadding="3" cellspacing="1" align="center" class="tableborder11" id="table1">
		<tr>
			<td valign="middle" colspan="2" align="center" height="25" color="#9999FF">
			<font color="#ffffff"><b>新增商品</b></font></td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1" align="center"><b>【商品名称】</b>：<br>
			</td>
			<td width="60%" class="tablebody1">
			<input maxLength="8" size="32" name="goods" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1" align="center"><b>【商品编号】</b>：<br>
			</td>
			<td width="60%" class="tablebody1">
			<input maxLength="8" size="32" name="goodsid" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1" align="center"><b>【生产厂商】</b>：<br>
			</td>
			<td width="60%" class="tablebody1">
			<input maxLength="8" size="32" name="address" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		
		<tr>
			<td width="40%" class="tablebody1" align="center"><b>【商品价格】</b>：<br>
			</td>
			<td width="60%" class="tablebody1">
			<input maxLength="8" size="32" name="price" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1" align="center"><b>【商品类别】</b>：<br>
			</td>
			<td width="60%" class="tablebody1">
			<input maxLength="8" size="32" name="sort" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td width="40%" class="tablebody1" align="center"><b>【商品数量】</b>：<br>
			</td>
			<td width="60%" class="tablebody1">
			<input maxLength="8" size="32" name="num" style="font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000">
			</td>
		</tr>
		<tr>
			<td class="tablebody2" valign="middle" colspan="2" align="center">
			<input type="button" value="入库" onclick="javascript:checkRegGoods()">&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="清 除"></td>
		</tr>
	</table>
	</div>
</form>
	</body>
</html>