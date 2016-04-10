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
    
    <title>My JSP 'addstu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		form{
			margin-left:40%;
		}
	</style>
  </head>
  
  <body>
  	<h1 align="center">增加学生信息</h1>
  	<hr>
    <form action="servlet/UseServlet" method="post">
   	 学号：<input type="text" name="stu_id"><br/><br/>
   	 姓名：<input type="text" name="stu_name"><br/><br/>
   	 性别：<input type="text" name="stu_gender"><br/><br/>
   	 年龄：<input type="text" name="stu_age"><br/><br/>
   	 院系：<input type="text" name="stu_dept"><br/><br/>
   	 专业：<input type="text" name="stu_major"><br/><br/>
   	&nbsp&nbsp&nbsp<input type="submit" value="提交">&nbsp&nbsp<input type="button" value="主页" onclick="location='Main.jsp'" />
    <input type="hidden" value="1" name="hidden">
    </form>
	<%-- <%
		request.setCharacterEncoding("utf-8");
		String stu_id = request.getParameter("stu_id");
		String stu_name = request.getParameter("stu_name");
		String stu_gender = request.getParameter("stu_gender");
		String stu_age = request.getParameter("stu_age");
		String stu_dept = request.getParameter("stu_dept");
		String stu_major = request.getParameter("stu_major");

		Students stu = new Students();
		Operat op = new Operat();

		stu.setStu_id(stu_id);
		stu.setStu_name(stu_name);
		stu.setStu_gender(stu_gender);
		stu.setStu_age(stu_age);
		stu.setStu_dept(stu_dept);
		stu.setStu_major(stu_major);
		op.addStu(stu);
	%> --%>
</body>
</html>
