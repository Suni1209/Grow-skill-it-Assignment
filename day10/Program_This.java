package day10;
class EmployeeUser
{
	int empId;
	String empName;
	int empAge;
	final String CompanyName="TCS Pvt Limited";
	
	void printdata() 
	{
	System.out.println(this.empId+":"+this.empName);
	}
	EmployeeUser(int empId,String empName,int EmpAge)
	{
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
		
	}
}
public class Program_This{
	public static void main(String[]args) {
		EmployeeUser emp=new EmployeeUser(101,"Rajat",35);
		emp.printdata();
		emp.CompanyName="Infosys Pvt Limited";
		System.out.println(emp.CompanyName);
		
	

	
		
		

	}

}
