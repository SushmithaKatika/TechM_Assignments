package org.db;

import java.sql.*;
import java.util.Scanner;
public class jdbcTask4 {
	public static void main(String[] arg) throws SQLException,Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Tiger");
		PreparedStatement ps=null;
		int choice;
		do {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1 to Insert a row");
			System.out.println("Enter 2 to Update a row");
			System.out.println("Enter 3 to delete a row");
			System.out.println("Enter 4 to Select the row");
			System.out.println("Enter 5 to EXIT ");
			
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter the Employee Id");
				int empId=sc.nextInt();
				
				System.out.println("Enter the Employee Name");
				String empName;
				empName=sc.next();
				
				System.out.println("Enter the Employee Salary");
				int empSal;
				empSal = sc.nextInt();
				
				ps = con.prepareStatement("insert into emp values(?,?,?)");
				ps.setInt(1, empId);
				ps.setString(2, empName);
				ps.setInt(3, empSal);
				
				int value = ps.executeUpdate();
				if(value>0) {
					System.out.println(value + "Row inserted into the table");
				}
				break;
			case 2:

				System.out.println("Enter the current employee id to update");
				int currentId=sc.nextInt();
				
				System.out.println("Enter the new employee name : ");
				String newempName=sc.next();
				
				System.out.println("Enter the new  employee Id  : ");
				int newempId=sc.nextInt();
				
				System.out.println("Enter the new employee Salary : ");
				int newempSal=sc.nextInt();
				
				
				ps= con.prepareStatement("Update emp set empId=?,empName=?,empSal=? where empId=? ");
				ps.setInt(1, newempId);
				ps.setString(2, newempName);
				ps.setInt(3, newempSal);
				ps.setInt(4, currentId);
				
				int val=ps.executeUpdate();
				if(val>0) {
					System.out.println("Updated sucessfully completed");	
				}else {
					System.out.println("No row found with the specified ID");
				}
				break;
				
			case 3:
				System.out.println("Enter employee Id to delete the row");
				
				int empIdToDelete=sc.nextInt();
				ps=con.prepareStatement("DELETE FROM emp where empId=?");
				ps.setInt(1, empIdToDelete);
				int rowDelete=ps.executeUpdate();
				if(rowDelete>0) {
					System.out.println("Row successfully deleted");
				}else {
					System.out.println("NO Row found with specific Id " );
				}
				break;
				
			case 4:
				System.out.println("Enter the employee id to Retrive : ");
				int eId=sc.nextInt();
				
				ps=con.prepareStatement("select empId, empName, empSal From emp where eId=?");
				ps.setInt(1,eId);
				
				
				ResultSet rs=ps.executeQuery();
				if (rs.next()) {
                    System.out.println("Employee ID: " + rs.getInt("empId"));
                    System.out.println("Employee Name: " + rs.getString("empName"));
                    System.out.println("Employee Salary: " + rs.getDouble("empSal"));
                } else {
                    System.out.println("No row found with the specified ID.");
                }
				rs.close();
				break;
				
			}
		}while(choice!=5);
		ps.close();
		con.close();
	}
}
