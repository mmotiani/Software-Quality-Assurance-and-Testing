public class TechnicalSupportStaff extends OfficeStaff
{
	private String technicalArea;
	protected TechnicalSupportStaff(String fName, String lName, String ta, boolean hp, double ms, double hr)
	{
		super(fName,lName,hp,ms,hr);
		technicalArea = ta;
	}
	protected void view()
	{
	      System.out.println();
	      super.view();
		  System.out.println("Technical Area:" + technicalArea);
	}
}
