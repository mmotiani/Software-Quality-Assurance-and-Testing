public class Faculty extends OfficeStaff
{
	private String department;
	private String researchArea;
	protected Faculty(String fName, String lName, String dep, String res, boolean hp, double ms, double hr)
	{
	  super(fName,lName,hp,ms,hr);
	  department = dep;
	  researchArea = res;
	}
	protected void view()
	{
	  System.out.println();
	  super.view();
	  System.out.println("Department:" + department);
	  System.out.println("Research Area:" + researchArea);
	}
}