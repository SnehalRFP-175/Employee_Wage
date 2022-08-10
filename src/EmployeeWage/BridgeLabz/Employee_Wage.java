package EmployeeWage.BridgeLabz;

/*
 * *********Added UC2*********
 * Calculating Daily Employee Wage
 */

public class Employee_Wage 
{
	public static void main(String a[])
	{
		int is_full_time = 1;
		int emp_rate_perhr = 20;
		
		 
		 int emphrs = 0;
		 int empwage = 0;
		
		double emp_check = Math.floor(Math.random() * 10 ) % 2;
		
		if(emp_check == is_full_time)
		{
			System.out.println( "Employee is Present....");
			 emphrs = 8;
		}
		else
			{
			System.out.println("Employee is Abscent.... ");
			}
			empwage = emphrs * emp_rate_perhr;
		 System.out.println("Employee Wage =" +empwage);
	}

}