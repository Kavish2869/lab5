package com.cg.eis.service;

import com.cg.eis.bean.*;

public interface EmployeeService 
{
	public abstract void addEmployeeDetails(int id,String name,double salary, Designation designation,
			InsuranceScheme insurancescheme);

	public abstract InsuranceScheme showInsuranceScheme(int id, double salary, Designation designation);

	public abstract String dispEmployeeDetails(int id);

}

