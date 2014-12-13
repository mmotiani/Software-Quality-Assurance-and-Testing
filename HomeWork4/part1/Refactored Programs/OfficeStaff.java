
public class OfficeStaff extends School
{

protected boolean hourlyPaid;
protected double hourlyRate;
protected double  monthly_salary;

protected OfficeStaff(String fName, String lName, boolean hp, double ms, double hr)
{
	super(fName,lName);
	 hourlyPaid = hp;
	 monthly_salary = ms;
     hourlyRate = hr;

}
protected void view(){

     
	super.view();
	  if(hourlyPaid)
	   System.out.println("Hourly Rate:" + hourlyRate);
	  else
      System.out.println("Monthly Salary:" + monthly_salary);



	}

}