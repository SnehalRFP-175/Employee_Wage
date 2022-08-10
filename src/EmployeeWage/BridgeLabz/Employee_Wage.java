package EmployeeWage.BridgeLabz;

/*
 * *********Added UC1*********
 * Checking Employee is Present or Not
 */
public class Employee_Wage 
{
	public static void main(String a[])
	{
		int is_full_time = 1;
		
		double emp_check = Math.floor(Math.random() * 10 ) % 2;
		
		if(emp_check == is_full_time)
		{
			System.out.println( "Employee is Present....");
		}
		else
		{
			System.out.println("Employee is Abscent.... ");
		}
			
	}

}