package EmployeeWage.BridgeLabz;
/*
 * *********Added UC6*********
 * Calculate Wages till a condition of total working hours or 
   days is reached for a month - Assume 100 hours
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
		final int max_hrs_in_month = 100;
		
		//Variables 
		 int totalWorkingDays = 0;
		 int totalEmpHrs = 0;
		 int totalempwage = 0;
		 
		
		while(totalEmpHrs <= max_hrs_in_month  &&  totalWorkingDays <= num_of_working_days)
		 {	
			 int emphrs = 0;
			 int empwage = 0;
			
			 totalWorkingDays++; 
			 
			 int emp_check = (int) Math.floor(Math.random() * 10 ) % 3;
			 
			 switch(emp_check)
			 {
			 case is_part_time : 
				 System.out.println( "Part Time");
				 emphrs = 4;	
				 break;
				 
			 case is_full_time :
				 System.out.println( "Employee is Present....");
				 emphrs = 8;
				 break;
				 
			 default :
				 System.out.println("Employee is Abscent.... ");
				 emphrs = 0; 
				 break;
			 }
			 totalEmpHrs = emphrs;
			 empwage = emphrs * emp_rate_perhr;
			 totalempwage += empwage;
			 System.out.println("Employee Wage =" +empwage);

		 }
		 System.out.println("\nTotal Employee Hours =" +totalEmpHrs);
		 System.out.println("\nTotal Employee Wage =" +totalempwage);		
	}

}