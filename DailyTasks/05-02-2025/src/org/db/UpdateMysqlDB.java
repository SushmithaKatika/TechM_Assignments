package org.db;

import java.sql.*;
public class UpdateMysqlDB {
public static void main(String args[])throws SQLException,Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Tiger");
	
	PreparedStatement ps = con.prepareStatement("update emp set empName=? where empName=?");
	ps.setString(1, "sravani");
	ps.setString(2, "neha");
	
	int value = ps.executeUpdate();
	System.out.println("Row updated in the Table");	
   }
}