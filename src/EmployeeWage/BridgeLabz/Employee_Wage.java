package EmployeeWage.BridgeLabz;
/*
 *UC7 - Refactor the Code to write a Class Method to Compute Employee Wage -
 */

public class Employee_Wage
{
	//Constants
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	public static final int emp_rate_perhr = 10;
	public static final int num_of_working_days = 20;
	public static final int max_hrs_in_month = 100;
	
	//Class variables
	//Variables 
	 int totalWorkingDays = 0;
	 int totalEmpHrs = 0;
	 int totalEmpWage=0;
	
	public int Compute_EmployeeWage()
	{
		
		
		while(totalEmpHrs <= max_hrs_in_month && totalWorkingDays <= num_of_working_days)
		 {	
			 int empHrs = 0;
			 int empWage = 0;
			
			 totalWorkingDays++;
			 int emp_Check = (int) Math.floor ( Math.random() * 10 ) % 3;
			
			 switch(emp_Check)
			 {
			 	case is_full_time:
			 		empHrs = 8;
			 		break;
			 		
			 	case is_part_time: 
			 		empHrs = 4;
			 		break;
			 		
			 	default:
			 		empHrs = 0; 
			 		break;
			 	 
			 }
			 
			 totalEmpHrs = empHrs;
			 empWage=empHrs * emp_rate_perhr;
			 totalEmpWage += empWage;
			 System.out.println("Employee Wage =" +empWage);	 
		 
		 }
		
		System.out.println("\nTotal Employee Hours =" +totalEmpHrs);
		
		return totalEmpWage;
	}
			
	public static void main(String args[])
	{
		Employee_Wage  Emp = new Employee_Wage();
		
		int result = Emp.Compute_EmployeeWage();
		System.out.println("Total Employee Wage =" +result);
	}				
}

