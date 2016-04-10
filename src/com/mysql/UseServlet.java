package com.mysql;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

public class UseServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	Students stu = new Students();
	public UseServlet() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the GET method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();
		doPost(request, response);
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the POST method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//	
//		
//		out.flush();
//		out.close();
//	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String stu_id = request.getParameter("stu_id");
		String stu_name = request.getParameter("stu_name");
		String stu_gender = request.getParameter("stu_gender");
		String stu_age = request.getParameter("stu_age");
		String stu_dept = request.getParameter("stu_dept");
		String stu_major = request.getParameter("stu_major");
		String modid = request.getParameter("modid");
		
		Operat op = new Operat();

		stu.setStu_id(stu_id);
		stu.setStu_name(stu_name);
		stu.setStu_gender(stu_gender);
		stu.setStu_age(stu_age);
		stu.setStu_dept(stu_dept);
		stu.setStu_major(stu_major);
	
		
		
		switch (Integer.parseInt(request.getParameter("hidden"))) {
		case 1:
			op.addStu(stu);
			request.getRequestDispatcher("../addstu.jsp").forward(request, response);
			break;
		case 2:
			op.delete(stu);
			request.getRequestDispatcher("../Main.jsp").forward(request, response);
			break;
		case 3:
			op.modify(stu,modid);
			request.getRequestDispatcher("../Main.jsp").forward(request, response);
			break;
		case 4:
			op.find();
			request.getRequestDispatcher("../Main.jsp").forward(request, response);
			break;
		default:
			break;
		}
//		String stu_delid = request.getParameter("delid");
//	  	stu.setStu_id(stu_delid);
	  
	  	
	  	
	  
	  	
//	  	response.setContentType("text/html");
		
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>学生信息管理系统</TITLE></HEAD>");
//		out.println("  <BODY>");
//		
//		out.println("  <a href='http://localhost:8080/MysqlTest/Main.jsp'>返回主页</a>");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//	
//		
//		out.flush();
//		out.close();
	}

}
