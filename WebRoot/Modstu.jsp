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
    
    <title>My JSP 'Modstu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<Script Language="JavaScript">
		function alertMod(){
			alert("修改成功！！！跳回主页可进行查看");
		}
	</Script>
  </head>
  
  <body>
  <center>
  <h1>修改学生信息</h1>
  <hr>
  <form action="servlet/UseServlet" method="post">
   	 需要修改信息学生学号为：<input type="text" name="modid"/><br/><br/>
   	  学号：<input type="text" name="stu_id"><br/><br/>
   	 姓名：<input type="text" name="stu_name"><br/><br/>
   	 性别：<input type="text" name="stu_gender"><br/><br/>
   	 年龄：<input type="text" name="stu_age"><br/><br/>
   	 院系：<input type="text" name="stu_dept"><br/><br/>
   	 专业：<input type="text" name="stu_major"><br/><br/>
   	<input type="hidden" name="hidden" value="3">
   	<input type="submit" value="提交" onclick="alertMod()">&nbsp&nbsp<input type="button" value="主页" onclick="location='Main.jsp'">
   	
  </form></center>
  
 <%--  <%
  	request.setCharacterEncoding("utf-8");
    String stu_id = request.getParameter("stu_id");
    String stu_name = request.getParameter("stu_name");
    String stu_gender = request.getParameter("stu_gender");
    String stu_age = request.getParameter("stu_age");
    String stu_dept = request.getParameter("stu_dept");
    String stu_major = request.getParameter("stu_major");
    String modid = request.getParameter("modid");
    
    Students stu = new Students();
    Operat op = new Operat();
    
    stu.setStu_id(stu_id);
    stu.setStu_name(stu_name);
    stu.setStu_gender(stu_gender);
    stu.setStu_age(stu_age);
    stu.setStu_dept(stu_dept);
    stu.setStu_major(stu_major);
    op.modify(stu,modid);
   %> --%>
  
  </body>
</html>
