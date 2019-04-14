package com.capg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capg.bo.Employee;
import com.capg.utils.DbUtil;

public class EmployeeDAOImpl {
	PreparedStatement ps = null;
	String sql = null;
	int rows;
	public void saveEmployee(Employee e) {
		Connection con = DbUtil.getConnection();
		sql = "INSERT INTO EMPLOYEE (NAME,CITY,SALARY) VALUES(?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,  e.getName());
			ps.setString(2,  e.getCity());
			ps.setDouble(3, e.getSalary());
			rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("Employee saved sucessfully!");
			} else {
				System.out.println("Employee not saved.");
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			DbUtil.close(con);
		}
	}
	public void updateEmployee(Employee e, int id) {
		Connection con = DbUtil.getConnection();
		sql = "UPDATE EMPLOYEE SET NAME = ?, CITY = ?, SALARY = ? WHERE ID = " + id;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,  e.getName());
			ps.setString(2,  e.getCity());
			ps.setDouble(3, e.getSalary());
			rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("Employee updated sucessfully!");
			} else {
				System.out.println("Employee not updated.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		} finally {
			DbUtil.close(con);
		}
	}
	
	public void deleteEmployee(int empid) {
		Connection con = DbUtil.getConnection();
		sql = "DELETE FROM EMPLOYEE WHERE ID = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,  empid);
			rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("Employee deleted sucessfully!");
			} else {
				System.out.println("Employee not found.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		} finally {
			DbUtil.close(con);
		}
	}
	
	public Employee findEmployee(int empid) {
		Connection con = DbUtil.getConnection();
		String sql = "SELECT ID, NAME, CITY, SALARY FROM EMPLOYEE WHERE ID = " + empid;
		Employee e = null;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("name");
				String empCity = rs.getString("city");
				double empSalary = rs.getDouble("salary");
				e = new Employee(empId, empName, empCity, empSalary);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		} finally {
			DbUtil.close(con);
		}
		return e;
	}
	
	public List<Employee> findAll() {
		Connection con = DbUtil.getConnection();
		List<Employee> empList = new ArrayList<Employee>();
		String sql = "SELECT ID, NAME, CITY, SALARY FROM EMPLOYEE";
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()) {
				int empId = rs.getInt("id");
				String empName = rs.getString("name");
				String empCity = rs.getString("city");
				double empSalary = rs.getDouble("salary");
				Employee emp = new Employee(empId, empName, empCity, empSalary);
				empList.add(emp);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		} finally {
			DbUtil.close(con);
		}
		return empList;
	}
}
