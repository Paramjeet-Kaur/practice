import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeevalues=new Employee("john Smith",9,"IT","MANAGER");
		Employee employeevalues1=new Employee("jobn",10,"IT","DEPT MANAGER");
		employeevalues1.setName("Jobanpreet Singh");
		ArrayList<Employee> empArr = new ArrayList<Employee>();
		empArr.add(employeevalues1);
		empArr.add(employeevalues);
		
		CompanyEmployee compantObj = new CompanyEmployee("Lambton", empArr);
		
		
		
		System.out.println("Number of Employees : " + compantObj.numberOfEmployees());
		compantObj.employeeReport();
/*		
		String employ=employeevalues.getName();
		int dept=employeevalues.getId();
		System.out.println("employee name " +employ);
		System.out.println("dept "+dept);
		String employ1=employeevalues1.getName();
		int dept1=employeevalues1.getId();
		System.out.println("employee name " +employ1);
		System.out.println("dept "+dept1);
	
	*/
	}

}
