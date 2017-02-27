<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'ognlexpression.jsp' starting page</title>
    
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
	    This is my OGNL page! <br>
	    
	list:    <s:property value="list"/><br/>
	list[0].name:    <s:property value="list[0].name"/>            <br/>
	list[0].function1():    <s:property value="list[0].function1()"/>            <br/>
	list[0].name.toUpperCase().length():    <s:property value="list[0].name.toUpperCase().length()"/>            <br/>
	list[0].cat.name:    <s:property value="list[0].cat.name"/> <br/>
	list[0].cat.age:    <s:property value="list[0].cat.age"/> <br/>
	list[0].friends:    <s:property value="list[0].friends"/><br/>
	list[0].friends[2]:    <s:property value="list[0].friends[2]"/><br/>
	list[1].map['key4']:    <s:property value="list[1].map['key4']"/><br/>
	<s:iterator var="p" >
	
	</s:iterator>
---------------------------------------------<br/>
	#msg:  <s:property value="#msg"/>	    <br/>
	#request.msg:  <s:property value="#request.msg"/>	${msg} <br/> 
	msg:  <s:property value="msg"/>	 <br/>   

	[0].top:  <s:property value="[0].top"/>	 <br/>
	---------------------------------------------<br/>
    valuestack:  <s:property value="[0]"/>	 <br/>
	   
	---------------------------------------------<br/>
    list.{name}:    <s:property value="list.{name}"/>            <br/>	    
    list.{name.length()>5?name:'hello'}:    <s:property value="list.{name.length()>5?name:'hello'}"/>            <br/>	    
	list.{? #this.age>18}:    <s:property value="list.{? #this.age>18}"/>            <br/>
	list.{^ #this.age>18}[0].name:    <s:property value="list.{^ #this.age>18}[0].name"/>            <br/>
	
<%-- 	<s:set name="age1" value="39"/>
	<s:property value="#age1"/> --%>
  </body>
</html>
