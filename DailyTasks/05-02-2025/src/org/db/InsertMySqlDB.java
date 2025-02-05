package org.db;

import java.sql.*;
import java.util.Scanner;
public class InsertMySqlDB {
public static void main(String args[]) throws Exception,SQLException {
	Scanner scan = new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Tiger");
	
	System.out.println("Enter the Employee Id");
	int empId;
	empId=scan.nextInt();
	
	System.out.println("Enter the Employee Name");
	String empName;
	empName=scan.next();
	
	System.out.println("Enter the Employee Salary");
	int empSal;
	empSal = scan.nextInt();
	
	PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
	pstmt.setInt(1, empId);
	pstmt.setString(2, empName);
	pstmt.setInt(3, empSal);
	
	int value = pstmt.executeUpdate();
	System.out.println(value + "Row inserted into the table");
	
	pstmt.close();
	con.close();
  }
}
