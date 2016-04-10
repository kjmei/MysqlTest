import java.sql.*;
import java.util.Scanner;

public class OperatMysql {
	
	static ResultSet rs = null;
	static Connection conn = null;
	static Statement state = null;
	static Student stu = new Student();
	static String id = stu.getStu_id();
	static String name = stu.getStu_name();
	static String gender = stu.getStu_gender();
	static String age = stu.getStu_age();
	static String dept = stu.getStu_dept();
	static String major = stu.getStu_major();
	public static void connection(){
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mysql://107.170.239.139:3306/student";
			String username = "root";
			String password = "rootpasswd";
			conn = DriverManager.getConnection(url,username,password);
			state = conn.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void close(){
		try{
			if(rs!=null){
				rs.close();
			}
			if(state!=null){
				state.close();
			}
			if(conn!=null){
				conn.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	public static void addstu(){
		connection();
		
			String sql = "insert into stu_base values"+"("+id+","+name+","+gender+","+age+","+dept+","+major+")";
			try {
				state.execute(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			close();
	}
	
	public static void delete(){
		connection();
//		String idnum = stu.getStu_id();
		String delsql = "delete from student where id"+"="+id;
		try {
			state.executeUpdate(delsql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}
	
	public static void modify(){
		connection();
		String modify = "update stu_base set" + "";
		close();
	}
	
	public static void find() throws SQLException{
		connection();
		String sql = "select * from student";
		rs = state.executeQuery(sql);
		while (rs.next()) {
			String id = String.valueOf(rs.getInt(1));
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			int age = rs.getInt("age");
			String dept = rs.getString("dept");
			String major = rs.getString("major");
			System.out.println("student info:" + "id:" + id+ ",name:" + name +",gender:" + gender + ",age:" + age + ",dept:" + dept + ",major:" +major );
		}
		close();
	}

}
