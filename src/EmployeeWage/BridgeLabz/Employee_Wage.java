package EmployeeWage.BridgeLabz;
/*
 * *********Added UC5*********
 * Calculating Employee Wages for a Month
 */

public class Employee_Wage 
{
	public static void main(String a[])
	{
		//Constants
		final int is_part_time = 1;
		final int is_full_time = 2;
		final int emp_rate_perhr = 20;
		final int num_of_working_days = 20;
		
		//Variables 
		 int emphrs = 0;
		 int empwage = 0;
		 int totalempwage = 0;
		 
		
		
		 for(int day = 0; day < num_of_working_days; day++) 
		 {
			 int emp_check = (int) Math.floor(Math.random() * 10 ) % 3;
			 switch(emp_check)
			 {
			 case is_full_time :
				 System.out.println( "Employee is Present....");
				 emphrs = 8;
				 break;
				 
			 case is_part_time : 
				 System.out.println( "Part Time");
				 emphrs = 4;	
				 break;
				 
			 default :
				 System.out.println("Employee is Abscent.... ");
				 emphrs = 0; 
				 break;
			 }
			 empwage=emphrs * emp_rate_perhr;
			 totalempwage += empwage;
			 System.out.println("Employee Wage =" +empwage);

		 }
		
		 System.out.println("Total Employee Wage =" +totalempwage);		
	}

}