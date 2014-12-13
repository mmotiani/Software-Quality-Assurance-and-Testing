public class Student extends School
{
	private String major;
	private double gpa;
	private String academicLevel;
	protected Student(String fName, String lName,String al, String m, double gp)
	{
	  super(fName,lName);
	  major = m;
	  gpa = gp;
	  academicLevel = al;
	}
	protected void view()
	{
		System.out.println();
		super.view();
		System.out.println("Major:" + major);
		System.out.println("GPA :" + gpa);
		System.out.println("academic Level :" + academicLevel);
	}
}
