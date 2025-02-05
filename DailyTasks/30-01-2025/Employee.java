package full_stack;

import java.util.Scanner;

public class Employee {

    int empId;
	String empName;
	double sal;

public void setEmployeeDetails(int empId,String empName,double sal) {
	this.empId=empId;
	this.empName=empName;
	this.sal=sal;
}
public void getEmployeeDetails() {
	System.out.println("employee ID "+empId);
	System.out.println("employee name "+empName);
	System.out.println("employee Salary "+sal);
	
}
public void getLoanEligibility() {
	int years=6;
	if(years>5) {
		if(sal==600000) {
			System.out.println("2 lakhs of loan is granted");
		}
		else if(sal>=1000000 && sal<1500000) {
			System.out.println("5 lakhs of loan is granted");
		}
		else if(sal>=1500000) {
			System.out.println("7 lakhs of loan is granted");
		}
		else {
			System.out.println("loan is not granted");
		}
		
	}
	else {
		System.out.println("loan is not granted");
		
	}
}
public static void main(String[] arg) {
	Scanner scan=new Scanner(System.in);
	int empId=scan.nextInt();
	String empName=scan.next();
	double sal=scan.nextDouble();
	Employee emp=new Employee();
	emp.setEmployeeDetails(empId,empName,sal);
	emp.getEmployeeDetails();
	emp.getLoanEligibility();
}
}
