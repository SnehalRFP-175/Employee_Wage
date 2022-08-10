package EmployeeWage.BridgeLabz;
/*
 *UC8 - Compute Employee Wage for multiple companies 
 */

public class Employee_Wage
{
	//Constants
		public static final int is_part_time = 1;
		public static final int is_full_time = 2;
		
		//Variables 
		 int totalEmpWage = 0;
		 int totalWorkingDays = 0;
		 int totalEmpHrs = 0;
		
		
		public void Compute_EmployeeWage( String company ,int Emp_Rate_Per_Hr, int Num_of_Working_Days, int Max_Hrs_in_Month)
		{
			
			System.out.println("\n \nCompany Name: "+company + "\nEmployee Rate Per Hour: " +Emp_Rate_Per_Hr + "\nNum of Working Days: "+Num_of_Working_Days +"\nMaximum Hours in Month: "+Max_Hrs_in_Month+"\n");

			
			while(totalEmpHrs <= Max_Hrs_in_Month && totalWorkingDays <= Num_of_Working_Days)
			 {	
				 int empHrs;
				 int empWage;
				
				 totalWorkingDays++;
				 int emp_check = (int) Math.floor ( Math.random() * 10 ) % 3;
				 switch(emp_check)
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
				 empWage = empHrs * Emp_Rate_Per_Hr;
				 totalEmpWage += empWage;
				 System.out.println("Employee Wage :" +empWage);
				 
			 }
			System.out.println("\nTotal Working Days ="+Num_of_Working_Days);
			System.out.println("Total Employee Hours ="+totalEmpHrs);
			
			 
			System.out.println("Total Employee Wage for "+company+ " is-->"+totalEmpWage );
				
		}
		
		
		public static void main(String a[])
		{	
			
			Employee_Wage Wipro = new Employee_Wage( );
			Employee_Wage TCS = new Employee_Wage( );
			
			Wipro.Compute_EmployeeWage( "Wipro", 15 , 5, 48);
			TCS.Compute_EmployeeWage( "TCS", 10, 5, 48 );
				
		}

	}
