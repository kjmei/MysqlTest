<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.mysql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'delstu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
  <form action="delstu.jsp" method="post">
    	删除学生学号为：<input type="text" id="delid"/>
    	<input type="submit" value="提交">
  </form>
  <%
  	String delid = request.getParameter("delid");
  	Student stu = new Student();
  	stu.setStu_id("delid");
   %>
  </body>
</html>
