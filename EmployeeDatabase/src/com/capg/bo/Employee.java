package com.capg.bo;
import java.util.Comparator;

public class Employee {
	private int id;
	private String name;
	private String city;
	private double salary;
	
	
	public Employee() {
		super();
	}

    public Employee(int id, String name, String city, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
    
    public Employee(String name, String city, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
		return String.format("%-5s %-15s %-15s %-10s\n", this.id, this.name, this.city, this.salary);
    }
    
    public boolean equals(Object obj) {
    	Employee emp1 = (Employee) obj;
    	if(this.name.equals(emp1.name)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public int hashCode() {
        return (int) (31 * name.hashCode() + salary);
    }
}
