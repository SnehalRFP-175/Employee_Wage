package EmployeeWage.BridgeLabz;
/*
 *UC9 - Calculate Total Wage for each Company 
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
		 
		 	String company;
			private int Emp_Rate_Per_Hr;
			private int Num_of_Working_Days;
			private int Max_Hrs_in_Month;
			private int total_EmpWage;
		
		
		public Employee_Wage( String company ,int Emp_Rate_Per_Hr, int Num_of_Working_Days, int Max_Hrs_in_Month)
		{
			this.company = company;
	        this.Emp_Rate_Per_Hr = Emp_Rate_Per_Hr;
	        this.Num_of_Working_Days = Num_of_Working_Days;
	        this.Max_Hrs_in_Month = Max_Hrs_in_Month;
		}
			
		public void Compute_EmployeeWage()
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
				 
				 totalEmpHrs += empHrs;
				 empWage = empHrs * Emp_Rate_Per_Hr;
				
				 System.out.println("Employee Wage :" +empWage);
				
				 
			 }
			 totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
			
			System.out.println("\nTotal Working Days ="+Num_of_Working_Days);
			System.out.println("Total Employee Hours ="+totalEmpHrs);
			
			System.out.println("Total Employee Wage for "+company+ " is-->"+totalEmpWage);
			
				
		}
		
		
		public static void main(String a[])
		{	
			
			Employee_Wage Wipro = new Employee_Wage("Wipro", 150 , 5, 10 );
			Employee_Wage TCS = new Employee_Wage( "TCS", 200, 5, 10 );
			
			Wipro.Compute_EmployeeWage();
			TCS.Compute_EmployeeWage();
				
		}

	}