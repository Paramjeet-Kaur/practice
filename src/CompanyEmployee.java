import java.util.ArrayList;

public class CompanyEmployee {

	String name;
	ArrayList<Employee> emparr=new ArrayList<Employee>();
	
public CompanyEmployee(String name,ArrayList<Employee> emparr)
{
	this.name=name;
	this.emparr=emparr;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList<Employee> getEmparr() {
	return emparr;
}

public void setEmparr(ArrayList<Employee> emparr) {
	this.emparr = emparr;
}

public int numberOfEmployees() {

	return this.emparr.size();
}

public void employeeReport() {
	
	for(int i=0; i<emparr.size(); i++) {
		System.out.println("Employee Details #" + (i+1));
	System.out.println("Name : " + emparr.get(i).getName());
	System.out.println("Department : " + emparr.get(i).getDepartment());
	}
}
}