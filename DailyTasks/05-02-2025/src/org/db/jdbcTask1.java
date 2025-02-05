package org.db;

import java.sql.*; 
import java.util.Scanner;

public class jdbcTask1 {
public static void main(String args[]) throws Exception,SQLException {
	Scanner scan = new Scanner(System.in);
	//include the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//establish the connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Tiger");
	PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
	System.out.print("Enter the number of employees to insert: ");
    int numRows = scan.nextInt();
    scan.nextLine();
    for (int i = 0; i < numRows; i++) {
	System.out.println("Enter the Employee "+(i+1)+" Id:");
	int empId;
	empId=scan.nextInt();
	
	System.out.println("Enter the Employee Name");
	String empName;
	empName=scan.next();
	System.out.println("Enter the Employee "+(i+1)+" salary:");
	int empSal=scan.nextInt();
	pstmt.setInt(1, empId);
	pstmt.setString(2, empName);
	pstmt.setInt(3, empSal);
	pstmt.addBatch();
    }
	int[] value = pstmt.executeBatch();
	System.out.println(value.length + " Rows inserted into the table");
	
	pstmt.close();
	con.close();
  }
}