package com.iris.test;

import java.util.Scanner;

import com.iris.daos.EmployeeDao;
import com.iris.daosimpl.EmployeeDaoImpl;
import com.iris.models.Employee;

public class MainClass {
	
	static Scanner sc=new Scanner(System.in);	
	static EmployeeDao daoObj=new EmployeeDaoImpl();
	
	static void insertEmployee() throws Exception{
		System.out.println("Enter employee details");
		int id=sc.nextInt();
		String name=sc.next();
		String gender=sc.next();
		String pass=sc.next();
		double sal=sc.nextDouble();
		
		Employee emp=new Employee();
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setGender(gender);
		emp.setPassword(pass);
		emp.setSalary(sal);
		
		boolean r=daoObj.addEmployee(emp);
		if(r==true){
			System.out.println("Employee Added");
		}
		else {
			System.out.println("Problem in Adding Employee");
		}
	}
	
	public static void main(String[] args) {
	

	System.out.println("Enter the operation u want to perform");
	System.out.println("1. Insert New Employee");
	System.out.println("2. Delete Employee");
	System.out.println("3. Get Employee By Id");
	System.out.println("4. Validate Employee");
	System.out.println("5. Get All Employees");
	
	try {
	
	int choice=sc.nextInt();
	switch(choice){
		case 1 : 
			insertEmployee();
			break;
		/*case 2 : 
			break;
		case 3 : 
			break;
		case 4 : 
			break;
		case 4 : 
			break;
		*/default : 
				System.out.println("Invalid Choice");
	}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}
