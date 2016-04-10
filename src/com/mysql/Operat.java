package com.mysql;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.enterprise.inject.New;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

public class Operat {

	ResultSet rs = null;
	Connection conn = null;
	Statement state = null;
	
	public void connection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			String url = "jdbc:mysql://107.170.239.139:3306/student";
			String username = "root";
			String password = "rootpasswd";
			conn = DriverManager.getConnection(url, username, password);
			state = conn.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (state != null) {
				state.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addStu(Students stu){
		connection();
		String id = stu.getStu_id();
		String name = stu.getStu_name();
		String gender = stu.getStu_gender();
		String age = stu.getStu_age();
		String dept = stu.getStu_dept();
		String major = stu.getStu_major();

		String addsql = "insert into stu_base values('" + id + "','" + name + "','"
				+ gender + "','" + age + "','" + dept + "','" + major + "')";
		try {
			state.execute(addsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}

	public void delete(Students stu) {
		connection();
		String id = stu.getStu_id();
		String delsql = "delete from stu_base where stu_id='"+ id+ "';";
		try {
			state.execute(delsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}

	public void modify(Students stu,String modid) {
		connection();
		
		String id = stu.getStu_id();
		String name = stu.getStu_name();
		String gender = stu.getStu_gender();
		String age = stu.getStu_age();
		String dept = stu.getStu_dept();
		String major = stu.getStu_major();
		String sql = "update stu_base set stu_id='"+id+"',"+"stu_name='"+name+"',"
		+"stu_gender='"+gender+"',"+"stu_age='"+age+"',"+"stu_dept='"+dept+"',"+"stu_major='"
				+major+"'"+"where stu_id='"+modid+"'";
		try {
			state.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}

	
	
	public Vector<Students> find() {
		connection();

		Vector<Students> stuList = new Vector<Students>();
		String sql = "select * from stu_base";
		Students stu;
		try {
			rs = state.executeQuery(sql);
			while (rs.next()) {
				stu = new Students();
				stu.setStu_id(rs.getString("stu_id"));
				stu.setStu_name(rs.getString("stu_name"));
				stu.setStu_gender(rs.getString("stu_gender"));
				stu.setStu_age(rs.getString("stu_age"));
				stu.setStu_dept(rs.getString("stu_dept"));
				stu.setStu_major(rs.getString("stu_major"));
				stuList.add(stu);

			}
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return stuList;
	}

}
