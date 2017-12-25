package com.method;

public class Emp_Method_Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Emp_Method emp=new Emp_Method();
		emp.emp_id=101;
		emp.emp_name="Harshad";
		emp.emp_salary=10000;
		emp.emp_bonus=2000;
		emp.Calculation();
		System.out.println("Harshad: " + emp.emp_Totalnet_Pay);

		Emp_Method emp1=new Emp_Method();
		emp.emp_id=102;
		emp.emp_name="Asha";
		emp.emp_salary=20000;
		emp.emp_bonus=4000;
		emp.Calculation();
		System.out.println("Asha: " + emp.emp_Totalnet_Pay);
	}
}