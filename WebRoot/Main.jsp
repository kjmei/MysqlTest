<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.mysql.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Main.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
#container {
	
	width:100%;
	height:100%;
	
}

#leftdiv {
	float:left;
	width:30%;
	height:100%;
	background:#ffcc33;
	
}

#rightdiv {
	float:left;
	width:70%;
	height:100%;
	background:#ffff99;
	
}
table{
	
	margin-top:5%;
	margin-left:5%;
}

#head{
	background:#66ffff;
}
#add{
	margin-top:45%;
	margin-left:40%;
}
#del{
	margin-left:40%;
}
#mod{
	margin-left:40%;
}
#sel{
	margin-left:40%;
}
</style>
</head>

<body>
	<div id="head">
		<br/><h1 align="center">学生信息管理</h1>
		<hr>
	</div>
	<div id="container">
		<div id="leftdiv">
			
			<input type="button" value="新增学生记录" id="add" onclick="location='addstu.jsp'" /><br/><br/><br/> 
			<input type="button" value="删除学生记录" id="del" onclick="location='delstu.jsp'" /><br/><br/><br/>
			<input type="button" value="修改学生记录" id="mod" onclick="location='Modstu.jsp'" /><br/><br/><br/>
			<input type="button" value="查询学生记录" id="sel" onclick="location='Main.jsp'"/>
			<input type="hidden" value="4" name="hidden">
		</div>
		<div id="rightdiv">
			<center><table border="1">
			<caption><h2>学生信息表</h2></caption>
				<tr>
					<th style="width:60px;height:30px">学号</th>
					<th style="width:90px;height:30px">姓名</th>
					<th style="width:60px;height:30px">性别</th>
					<th style="width:60px;height:30px">年龄</th>
					<th style="width:120px;height:30px">院系</th>
					<th style="width:120px;height:30px">专业</th>
				</tr>
				 <%
					Students stu = new Students();	//stu的值为空啊
					Operat op = new Operat();		//你又没给stu赋值。。op怎么找stu..
					int len = op.find().size();
					Vector<Students> stuList = op.find();	

				%>
				<%
					for (int i = 0; i < len; i++) {
						stu = stuList.get(i);

				%>
				<tr>
					<td align="center"><%=stu.getStu_id()%></td>
					<td align="center"><%=stu.getStu_name()%></td>
					<td align="center"><%=stu.getStu_gender()%></td>
					<td align="center"><%=stu.getStu_age()%></td>
					<td align="center"><%=stu.getStu_dept()%></td>
					<td align="center"><%=stu.getStu_major()%></td>
				</tr>
				<%
					}
				%>
			</table></center> 
		</div>
	</div>
	<%
		//String choose = request.getParameter(name);
	 %>
</body>
</html>
			