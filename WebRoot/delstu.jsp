<%@page import="com.mysql.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<style>
		form{
			margin-left:40%;
		}
		span{
			margin-left:10%;
		}
	</style>	
	<Script Language="JavaScript">
		function alertdel(){
			alert("删除成功！！！跳回主页可进行查看");
		}
	</Script>

  </head>
  
  <body>
  <h1 align="center">删除学生信息</h1>
  <hr>
  <form action="servlet/UseServlet" method="post">
    	删除学生学号为：<input type="text" name="stu_id"/>
    	<input type="hidden" value="2" name="hidden"><br/><br/>
    	<span><input type="submit" id="submit" value="确定" onclick="alertdel()"></span>
    	&nbsp&nbsp<input type="button" value="主页" onclick="location='Main.jsp'"/>
    	<%-- <%
    		String stu_id = request.getParameter("delid");
    	  	Operat op = new Operat();
    	  	Students stu = new Students();
    	  	stu.setStu_id(stu_id);
    	  	op.delete(stu);
    	%> --%>
  </form>
 	
  </body>
</html>
