package EmployeeWage.BridgeLabz;
/*
 *UC10 - Manage Employee Wage for Multiple Companies 
 */

public class Employee_Wage 
{
	//Constants
		public static final int is_part_time = 1;
		public static final int is_full_time = 2;
		
		private int Num_of_Company=0;
		private Company_Info[] Company_Info_Array;
		
		public Employee_Wage()
		{
			Company_Info_Array = new Company_Info[5];
		}
		 
		public void add_CompanyInfo(String company, int Emp_Rate_Per_Hr, int Num_of_Working_Days, int Max_Hrs_in_Month) {
			Company_Info_Array[Num_of_Company] = new Company_Info(company, Emp_Rate_Per_Hr, Num_of_Working_Days, Max_Hrs_in_Month);
			Num_of_Company++;
			
		}
		
		public void Compute_EmployeeWage() 
		{
			 for (int i = 0; i < Num_of_Company; i++) {
				 Company_Info_Array[i].setTotalEmpWage(this.Compute_EmployeeWage(Company_Info_Array[i]));  // inside bracket return totalEmpWage
		            System.out.println(Company_Info_Array[i]);
		        }
			
		}

		 
		private int Compute_EmployeeWage(Company_Info CompanyInfo)
		{
			 
			 int totalWorkingDays = 0;
			 int totalEmpHrs = 0;
			 
			 			
			while(totalEmpHrs <= CompanyInfo.Max_Hrs_in_Month && totalWorkingDays <= CompanyInfo.Num_of_Working_Days)
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
				 empWage = empHrs * CompanyInfo.Emp_Rate_Per_Hr;		 
			 }
			
			
			System.out.println("\nTotal Working Days ="+CompanyInfo.Num_of_Working_Days);
			System.out.println("Total Employee Hours ="+totalEmpHrs);
			
			return totalEmpHrs * CompanyInfo.Emp_Rate_Per_Hr;
			
				
		}
		
		
		public static void main(String a[])
		{	
			
			Employee_Wage empWage = new Employee_Wage();
			
			empWage.add_CompanyInfo("Infosys", 150, 2, 10);
			empWage.add_CompanyInfo("TCS" , 200, 3, 10);
			
			empWage.Compute_EmployeeWage();
			
				
		}
		}

	