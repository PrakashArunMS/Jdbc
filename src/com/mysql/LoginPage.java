package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginPage {
public static void main(String[] args)throws Exception {
	//load the driver
	Class.forName("com.mysql.jdbc.Driver");
	//connect database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_details","root","Prakash1@");
	String sql="Select * from emp_details";
	//Prepare Statement
	PreparedStatement ps=con.prepareStatement(sql);
	//Execute query
	ResultSet rs=ps.executeQuery();
	//iterate the result
	while(rs.next())
	{
		int i=rs.getInt(1);
		System.out.println(i);
		String s=rs.getString(2);
		System.out.println(s);
		String e=rs.getString(3);
		System.out.println(e);
	}
	con.close();
	
}
}
