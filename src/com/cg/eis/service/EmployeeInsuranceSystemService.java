package com.cg.eis.service;

import com.cg.eis.bean.Designation;
import com.cg.eis.bean.Employee;
import com.cg.eis.bean.InsuranceScheme;

public class EmployeeInsuranceSystemService implements EmployeeService
{
	private Employee empList[];

	public EmployeeInsuranceSystemService(int noOfEmp)
	{
		this.empList = new Employee[noOfEmp];
	}

	@Override
	public void addEmployeeDetails(int id, String name, double salary,
			Designation designation, InsuranceScheme insurancescheme) 
	{
		// TODO Auto-generated method stub
		if(id>0 && id<this.empList.length)
		{
			this.empList[id] = new Employee(id, name, salary, designation, insurancescheme);
		}

	}

	@Override
	public InsuranceScheme showInsuranceScheme(int id, double salary,
			Designation designation) 
	{
		// TODO Auto-generated method stub
		if(id>0 && id<this.empList.length)
		{
			if(salary>=40000 && designation==Designation.Manager)
			{
				return InsuranceScheme.SchemeA;
			}
			else if(salary>=20000 && salary <40000 && designation==Designation.Programmer)
			{
				return InsuranceScheme.SchemeB;
			}
			else if(salary>=5000 && salary <20000 && designation==Designation.SystemAssociate)
			{
				return InsuranceScheme.SchemeC;
			}
			else if(salary<5000 && designation==Designation.Clerk)
			{
				return InsuranceScheme.SchemeD;
			}
		}
		return null;
	}

	@Override
	public String dispEmployeeDetails(int id) 
	{
		// TODO Auto-generated method stub
		if(id>0 && id<this.empList.length)
			return this.empList[id].toString();
		return null;
	}



}



