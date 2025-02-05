package org.db;

import java.sql.*;

public class SelectMySqlDB {
public static void main(String args[]) throws SQLException,Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Tiger");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from dept");
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
	}
	
	rs.close();
	stmt.close();
	con.close();
   }
}