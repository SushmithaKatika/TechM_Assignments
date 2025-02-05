package org.db;

import java.sql.*;
import java.util.Scanner;

public class jdbcTask2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false", "root", "Tiger");
            
            PreparedStatement ps = con.prepareStatement("UPDATE emp SET empId=?, empName=?, empSal=? WHERE empId=?");

            System.out.println("Enter the current employee id to update: ");
            int currentEmpId = scanner.nextInt();
            
            scanner.nextLine(); 

            System.out.println("Enter the new employee Id: ");
            int newId = scanner.nextInt();
            
            scanner.nextLine(); 

            System.out.println("Enter the new employee name: ");
            String newEmpName = scanner.nextLine();
            
            System.out.println("Enter the new employee Salary: ");
            int newSal = scanner.nextInt();
            
            ps.setInt(1, newId);
            ps.setString(2, newEmpName);
            ps.setInt(3, newSal);
            ps.setInt(4, currentEmpId);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Row updated successfully in the Table");
            } else {
                System.out.println("No row found with the specified current employee ID.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); 
        } finally {
            scanner.close(); 
        }
    }
}
