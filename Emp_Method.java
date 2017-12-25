package com.method;

public class Emp_Method 
{
	int emp_id;
	String emp_name;
	double emp_salary;
	double emp_bonus; 
	double emp_Totalnet_Pay;
	
	public void Calculation()
	{
		emp_Totalnet_Pay=emp_salary+emp_bonus;
	}
}
