function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr;
  for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++)
	  x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; 
  if(d.images){ 
	  if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments;
    for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){
    	d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.0
  var p,i,x;  
  if(!d) d=document;
  if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; 
  for (i=0;!x&&i<d.forms.length;i++) 
	  x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++)
	  x=MM_findObj(n,d.layers[i].document);
  if(!x && document.getElementById) 
	  x=document.getElementById(n); 
  return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; 
  document.MM_sr=new Array; 
  for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){
	   document.MM_sr[j++]=x;
	   if(!x.oSrc) 
		   x.oSrc=x.src; 
	   x.src=a[i+2];}
}

function checkMe() {
   if(document.Alogin.in_be.value == "请输入管理员账号"||document.Alogin.pass.value == "请输入管理员密码") {
          alert("请输入您的账户或密码！");
          document.Alogin.in_be.focus();
          document.Alogin.pass.focus();
          return false;
    }
    if(document.Clogin.cin_be.value == "请输入客户账号"||document.Clogin.cpass.value == "请输入客户密码") {
        alert("请输入您的账户或密码！");
        document.Clogin.focus();
        return false;
    }
    document.login.submit();
    
}
function checkGoodsReg() {
	document.reg.submit();
}
function checkInGReg() {
	if(document.regin.Innum.value == "")
		{
		alert("请输入入库数量！");
		document.regout.Innum.focus();
		return false;
		}
	   alert("确认入库么？");
	   document.regin.submit();
}
function checkOutGReg() {
	if(document.regout.Outnum.value == "")
		{
		alert("请输入出库数量！");
		document.regout.Outnum.focus();
		return false;
		}
	   alert("确认出库么？");
	   document.regout.submit();
}
function checkRegGoods() {
	if(document.reg.goods.value == "") {
		alert("请输入商品名!");
		return false;}
	if(document.reg.address.value == "") {
		alert("请输入商品厂商!");
		return false;}
	if(document.reg.price.value == "") {
		alert("请输入价格!");
		return false;}
	if(document.reg.sort.value == "") {
		alert("请输入商品种类!");
		return false;}
	if(document.reg.num.value == "") {
		alert("请输入商品数量!");
		return false;}
	document.reg.submit();
	}
function checkReg() {
	var temp;
	temp = new String(document.reg.password.value);
	if(document.reg.userid.value == "") {
		alert("请输入用户名!");
		document.reg.userid.focus();
		return false;
	}
	if(document.reg.userid.name>10) {
		alert("请输入正确姓名!");
		document.reg.userid.focus();
		return false;
	}
	if(document.reg.userid.age >130||document.reg.userid.age <0) {
		alert("请输入正确年龄!");
		document.reg.userid.focus();
		return false;
	}
	if(document.reg.password.value == "") {
		alert("请输入密码!");
		document.reg.password.focus();
		return false;
	}else if(temp.length < 6 || temp.length > 8) {
		alert("您的密码少于6位或多于8位!");
		document.reg.password.focus();
		return false;
	}
	if(document.reg.password2.value == "") {
		alert("请再次输入密码!");
		document.reg.password2.focus();
		return false;
	} else if(document.reg.password.value != document.reg.password2.value) {
		alert("您二次密码输入不一致!");
		document.reg.password.value = "";
		document.reg.password2.value = "";
		document.reg.password.focus();
		return false;
	}
	if(document.reg.email.value != "" & IsEmail(document.reg.email.value)) {
		alert("您的E-mail不符合规范!");
		document.reg.email.focus();
		return false;
	}
	document.reg.submit();
}

function checkAInfReg() {
	var temp;
	temp = new String(document.reg.password.value);
	if(document.regAInf.userid.value == "") {
		alert("请输入用户名!");
		document.regAInf.userid.focus();
		return false;
	}
	if(document.regAInf.userid.name>10) {
		alert("请输入正确姓名!");
		document.reg.userid.focus();
		return false;
	}
	if(document.regAInf.userid.age >130||document.reg.userid.age <0) {
		alert("请输入正确年龄!");
		document.reg.userid.focus();
		return false;
	}
	if(document.regAInf.password.value == "") {
		alert("请输入密码!");
		document.reg.password.focus();
		return false;
	}else if(temp.length < 6 || temp.length > 8) {
		alert("您的密码少于6位或多于8位!");
		document.reg.password.focus();
		return false;
	}
	if(document.regAInf.password2.value == "") {
		alert("请再次输入密码!");
		document.reg.password2.focus();
		return false;
	} else if(document.reg.password.value != document.reg.password2.value) {
		alert("您二次密码输入不一致!");
		document.regAInf.password.value = "";
		document.regAInf.password2.value = "";
		document.regAInf.password.focus();
		return false;
	}
	if(document.reg.email.value != "" & IsEmail(document.reg.email.value)) {
		alert("您的E-mail不符合规范!");
		document.regAInf.email.focus();
		return false;
	}
	document.regAInf.submit();
}

function IsEmail(item){
	var etext
	var elen
	var i
	var aa
	var uyear,umonth,uday
	etext=item;
	elen=etext.length;
	if (elen<5)
 		return true;
	i= etext.indexOf("@",0)
	if (i==0 || i==-1 || i==elen-1)
 		return true;
	else
 		{if (etext.indexOf("@",i+1)!=-1)
  			return true;}
		if (etext.indexOf("..",i+1)!=-1)
 		return true;
	i=etext.indexOf(".",0)
	if (i==0 || i==-1 || etext.charAt(elen-1)=='.')
 		return true;
	if ( etext.charAt(0)=='-' ||  etext.charAt(elen-1)=='-')
 		return true;
	if ( etext.charAt(0)=='_' ||  etext.charAt(elen-1)=='_')
 		return true;
	for (i=0;i<=elen-1;i++)
		{ aa=etext.charAt(i)
 		 if (!((aa=='.') || (aa=='@') || (aa=='-') ||(aa=='_') || (aa>='0' && aa<='9') || (aa>='a' && aa<='z') || (aa>='A' && aa<='Z')))
   			return true;
		}
	return false;
}
