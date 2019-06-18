
public class Employee {
	String name;
	int id;
	String department;
	String jobTittle;

	public Employee(String name,int id,String department,String jobTittle)
	{
		this.name=name;
		this.id=id;
		this.department=department;
		this.jobTittle=jobTittle;
	}
	public Employee(String name,String jobTittle)
	{
		this.name=name;
		this.id=0;
		this.department="";
		this.jobTittle=jobTittle;
	}
	public Employee()
{
		this.name="";
		this.id=0;
		this.department="";
		this.jobTittle="";
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTittle() {
		return jobTittle;
	}
	public void setJobTittle(String jobTittle) {
		this.jobTittle = jobTittle;
	}
	
}
