package com.capg.dao;

import java.util.List;

import com.capg.bo.Employee;

public interface EmployeeDAO {
	public void saveEmployee(Employee e);
	public void updateEmployee(int empId);
	public void deleteEmployee(int empid);
	public Employee findEmployee(int empid);
	public List<Employee> findAll();
}
