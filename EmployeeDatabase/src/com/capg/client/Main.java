package com.capg.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.bo.Employee;
import com.capg.dao.EmployeeDAOImpl;

public class Main {
	public static void main(String[] args) {
		boolean showMenu = true;
		Scanner scan = new Scanner(System.in);
		EmployeeDAOImpl dao = new EmployeeDAOImpl();
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee emp = null;
		int empId;
		String empName, empCity;
		double empSalary;
		
		while(showMenu) {
			System.out.print("1. Add Employee \n2. View Employee \n3. View All Employees \n4. Delete employee \n5. Update Employee \n6. Exit\n");
			switch(scan.nextInt()) {
				case 1:
					System.out.println("Enter employee name: ");
					empName = scan.next();
					System.out.println("Enter employee city: ");
					empCity = scan.next();
					System.out.println("Enter employee salary: ");
					empSalary = scan.nextDouble();
					dao.saveEmployee(new Employee(empName, empCity, empSalary));
					break;
				case 2:
					System.out.println("Enter employee ID: ");
					empId = scan.nextInt();
					emp = dao.findEmployee(empId);
					if(emp != null) {
						System.out.format("%-5s %-15s %-15s %-10s\n", "Id", "Name", "City", "Salary");
						System.out.print(emp);
					} else {
						System.out.println("Employee not found.");
					}
					break;
				case 3:
					employeeList = dao.findAll();
					if(employeeList.isEmpty()) {
						System.out.println("No Employees currently exist.");
					} else {
						System.out.format("%-5s %-15s %-15s %-10s\n", "Id", "Name", "City", "Salary");
						for(Employee e : employeeList) {
							System.out.print(e);
						}
					}
					break;
				case 4:
					System.out.println("Enter employee ID to delete: ");
					empId = scan.nextInt();
					dao.deleteEmployee(empId);
					break;
				case 5:
					System.out.println("Enter employee ID: ");
					empId = scan.nextInt();
					System.out.println("Enter employee updated name: ");
					empName = scan.next();
					System.out.println("Enter employee updated city: ");
					empCity = scan.next();
					System.out.println("Enter employee updated salary: ");
					empSalary = scan.nextDouble();
					dao.updateEmployee(new Employee(empName, empCity, empSalary), empId);
					break;
				case 6:
					System.out.println("Goodbye");
					showMenu = false;
					scan.close();
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
	}
}
