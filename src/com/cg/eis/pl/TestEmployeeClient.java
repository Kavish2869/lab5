package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.bean.*;
import com.cg.eis.service.EmployeeInsuranceSystemService;

public class TestEmployeeClient 
{

	public static void main(String[] args)
	{
		int id;
		int choice;
		String name;
		double salary;
		Designation designation = null;
		InsuranceScheme ischeme;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees :");
		int n= sc.nextInt();
		EmployeeInsuranceSystemService emp = new EmployeeInsuranceSystemService(n);

		for(int i=0;i<n;i++)
		{
			System.out.println(" Enter the ID. : ");
			id = sc.nextInt();
			System.out.println("Enter Employee Name :");
			name = sc.next();
			System.out.println("Enter the Salary :");
			salary = sc.nextDouble();
			System.out.println("Enter the Designation :\nChoices :\n1.SystemAssociate\n2.Programmer\n3.Manager\n4.Clerk\n"
					+ "Enter your choice :");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 :
				designation = Designation.SystemAssociate;
				break;
			case 2 :
				designation = Designation.Programmer;
				break;
			case 3 :
				designation = Designation.Manager;
				break;
			case 4 :
				designation = Designation.Clerk;
				break;
			}

			ischeme = emp.showInsuranceScheme(id, salary, designation);
			emp.addEmployeeDetails(id, name, salary, designation, ischeme);

		}

		System.out.println("Employee Details :");
		for(int i=0;i<n;i++)
		{
			System.out.println(emp.dispEmployeeDetails(i));
		}
		sc.close();

	}

}