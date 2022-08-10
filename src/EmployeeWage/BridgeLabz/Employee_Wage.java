package EmployeeWage.BridgeLabz;
/*
 * *********Added UC3*********
 * Calculating Part time Employee Wage
 */

public class Employee_Wage 
{
	public static void main(String a[])
	{
		//Constants
		 int is_part_time = 1;
		 int is_full_time = 2;
		 int emp_rate_perhr = 20;
		
		//Variables 
		 int emphrs = 0;
		 int empwage = 0;
		 
		double emp_check = Math.floor(Math.random() * 10 ) % 2;
		
		if(emp_check == is_full_time)
			{
				System.out.println( "Employee is Present....");
				emphrs = 8;
			}
		else if (emp_check == is_part_time)
		{
			System.out.println( "Part Time");
				 emphrs = 4;	 
		}
		else
			{
			System.out.println("Employee is Abscent.... ");
			}
			empwage=emphrs * emp_rate_perhr;
			System.out.println("Employee Wage =" +empwage);		
	}

}