package EmployeeWage.BridgeLabz;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 *UC13 -Store Daily Wage along with Total Wage. 
 */

public class Employee_Wage implements EmpWage_Interface
{
		//Constants
		public static final int is_part_time = 1;
		public static final int is_full_time = 2;
		public static int totalEmpHrs = 0;
		public static int  empWage;
		
		//Created Array List for multiple companies
		private ArrayList<Company_Info> comapnyInfoList;
		
		
		public Employee_Wage()
		{
			comapnyInfoList = new ArrayList<>();
			
		}
		 
		public void add_CompanyInfo(String company, int Emp_Rate_Per_Hr, int Num_of_Working_Days, int Max_Hrs_in_Month) {
			
			Company_Info companyInfo = new Company_Info(company, Emp_Rate_Per_Hr, Num_of_Working_Days, Max_Hrs_in_Month);
			
			//Adds the Information to ArrayList
			comapnyInfoList.add(companyInfo);
			
			
		}
		
		public void Compute_EmployeeWage() 
		{
			 for (int i = 0; i < comapnyInfoList.size(); i++) {
				 
				 Company_Info companyInfo = comapnyInfoList.get(i);
				 companyInfo.setTotalEmpWage(this.Compute_EmployeeWage(companyInfo));
				 System.out.println(companyInfo);
		        }
			
		}

		 
		private int Compute_EmployeeWage(Company_Info CompanyInfo)
		{
			 
			 int totalWorkingDays = 0;
			 			
			while(totalEmpHrs <= CompanyInfo.Max_Hrs_in_Month && totalWorkingDays <= CompanyInfo.Num_of_Working_Days)
			 {	
				 int empHrs;
				
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
			return totalEmpHrs * CompanyInfo.Emp_Rate_Per_Hr;			
		}
		
		public static void main(String a[])
		{	
			
			Employee_Wage empWage = new Employee_Wage();
			
			empWage.add_CompanyInfo("Infosys", 150, 4, 10);
			empWage.add_CompanyInfo("TCS" , 200, 6, 20);
			empWage.add_CompanyInfo("Wipro" , 120, 5, 30);
			
			empWage.Compute_EmployeeWage();
			
				
		}

		
		}

	