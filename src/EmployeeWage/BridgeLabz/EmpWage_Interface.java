package EmployeeWage.BridgeLabz;

public interface EmpWage_Interface 
{
	public void add_CompanyInfo(String company, int Emp_Rate_Per_Hr, int Num_of_Working_Days, int Max_Hrs_in_Month);
	public void Compute_EmployeeWage();
}

class Company_Info {
	
	public final String company;
	public final int Emp_Rate_Per_Hr;
	public final int Num_of_Working_Days;
	public final int Max_Hrs_in_Month;
	public int total_EmpWage;


public Company_Info( String company ,int Emp_Rate_Per_Hr, int Num_of_Working_Days, int Max_Hrs_in_Month)
{
	this.company = company;
    this.Emp_Rate_Per_Hr = Emp_Rate_Per_Hr;
    this.Num_of_Working_Days = Num_of_Working_Days;
    this.Max_Hrs_in_Month = Max_Hrs_in_Month;
	
}

public void setTotalEmpWage(int total_EmpWage)
{
	this.total_EmpWage = total_EmpWage;
}

public String toString()
{
	return "Total Employee Wage For Company " +company+ " is " +total_EmpWage;
	
}

}
