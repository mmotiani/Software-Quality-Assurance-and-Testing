import java.util.*;
public class School
{
	protected String fName;
	protected String lName;
	private String schoolName;
	private ArrayList <Student> students;
	private ArrayList <Faculty> faculty;
	private ArrayList <OfficeStaff> o_staff;
	private ArrayList <TechnicalSupportStaff> ts_staff;
	protected School(String first_Name,String last_Name)
	{
		fName= first_Name;
		lName= last_Name;
	}
	protected School(String name)
	{
	  schoolName = name;
	  students = new ArrayList();
	  faculty = new ArrayList();
	  o_staff = new ArrayList();
	  ts_staff = new ArrayList();
	}
	protected void addstudents(Student s)
	{
		students.add(s);
	}
	protected void addfaculty(Faculty f)
	{
		faculty.add(f);
	}
	protected void addofficeStaff(OfficeStaff os)
	{
		o_staff.add(os);
	}
	protected void addTSS(TechnicalSupportStaff tss)
	{
		ts_staff.add(tss);
	}
	protected void displaySchoolInfo()
	{
		System.out.println("\t\t"+ schoolName);
		System.out.println("\t\t\t =============");
		for(int i=0; i<students.size(); i++)
		students.get(i).view();
		for(int i=0; i<faculty.size(); i++)
		faculty.get(i).view();
		for(int i=0; i<o_staff.size(); i++)
		o_staff.get(i).view();
		for(int i=0; i<ts_staff.size(); i++)
		ts_staff.get(i).view();
	}
	protected void view()
	{
		System.out.println("First Name:"+fName);
		System.out.println("Last Name:"+lName);
	}
}