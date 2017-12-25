package com.method;

public class Student 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Teacher t1=new Teacher();
		t1.student_id=100;
		t1.setStudent_name("Harshad");
		t1.setStudent_Address("Mumbai");
		System.out.println("Student Name is:"+ t1.getStudent_id() + t1.getStudent_name()+ t1.getStudent_Address());
	
/*		t1.student_id=100;
		t1.setStudent_name("Harshad");
		t1.setStudent_Address("Mumbai");
		System.out.println(t1.student_id+t1.student_name+t1.student_Address);
*/		
		t1.student_id=101;
		t1.setStudent_name("Asha");
		t1.setStudent_Address("Ahmedabad");
		System.out.println("Student Name is:"+ t1.getStudent_id() + t1.getStudent_name()+ t1.getStudent_Address());
		
		/*
		t1.student_id=101;
		t1.setStudent_name("Asha");
		t1.setStudent_Address("Ahmedabad");
		System.out.println(t1.student_id+t1.student_name+t1.student_Address);
		*/
	}

}
