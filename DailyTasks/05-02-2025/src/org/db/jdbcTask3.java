package org.db;

import java.sql.*;
import java.util.Scanner;
public class jdbcTask3 {
	public static void main(String[] arg)throws SQLException,Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Tiger");
		
		PreparedStatement ps=con.prepareStatement("DELETE FROM emp where empId=?");
		
		System.out.println("Enter employee Id to delete the row");
		Scanner sc=new Scanner(System.in);
		int empIdToDelete=sc.nextInt();
		ps.setInt(1, empIdToDelete);
		int value=ps.executeUpdate();
		if(value>0) {
			System.out.println("Row successfully deleted");
		}else {
			System.out.println("NO Row found with specific Id : "+value );
		}
		ps.close();
		con.close();
		sc.close();
		
	}
}
