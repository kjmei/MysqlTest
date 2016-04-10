package com.mysql;

import java.util.ArrayList;
import java.util.Vector;

public class Testadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operat op = new Operat();
		
		Vector<Students> students = op.find();
		
		System.out.println(students.get(2).getStu_id());
//		
//		Students stu = new Students();
////		int row = 0;
//		stu.setStu_id("1");
//		stu.setStu_name("b");
//		stu.setStu_gender("n");
//		stu.setStu_age("22");
//		stu.setStu_dept("c");
//		stu.setStu_major("d");
////		op.delete(stu);
////		op.addStu(stu);
//		op.modify(stu,"1");
//		System.out.println("ÐÞ¸Ä³É¹¦");
//		op.find(row);
//		op.find();
//		Vector<Students> stuList = op.find();
//		 int len = op.find().size();
//	   
//	    for(int i=0;i<len;i++){
//	    		 String id = stuList.get(i).getStu_id();
//	    		 String name = stuList.get(i).getStu_name();
//	    		 String gender = stuList.get(i).getStu_gender();
//	    		 String age = stuList.get(i).getStu_age();
//	    		 String dept = stuList.get(i).getStu_dept();
//	    		 String major =stuList.get(i).getStu_major();
////		System.out.println(id+","+name+","+gender+","+age+","+dept+","+major);
//	}
	}
}
