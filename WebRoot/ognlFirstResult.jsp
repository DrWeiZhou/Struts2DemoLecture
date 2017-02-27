<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    -------------------------------<br>
   #parameters.msg: <s:property value="#parameters.msg" /></br>
#request.msg: <s:property value="#request.msg" /></br >
#session.msg: <s:property value="#session.msg" /></br >
#application.msg: <s:property value="#application.msg" /></br >
#attr.userName: <s:property value="#attr.msg" /></br >
ActionContext信息：<s:property value="#msg" /></br >
ActionContext对象信息：<s:property value="#u1['name']" /></br >
ActionContext对象信息：<s:property value="#u1.name" /></br >
    --------------------------------<br>
msg:    <s:property value="msg"/><br/>
#msg:    <s:property value="#msg"/><br/>
[0].name:<s:property value="[0].name"/><br/>
name:<s:property value="name"/><br/>
[0].top.age:<s:property value="[0].top.age"/><br/>
    -------------------------------<br>
  </body>
  
</html>
