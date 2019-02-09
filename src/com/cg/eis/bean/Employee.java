package com.cg.eis.bean;

public class Employee {
	int id;
	String name;
	double salary;
	Designation designation;
	InsuranceScheme insurancescheme;
	public Employee(int id, String name, double salary, Designation designation, InsuranceScheme insurancescheme)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insurancescheme = insurancescheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", designation=" + designation + ", insurancescheme="
				+ insurancescheme + "]";
	}


}