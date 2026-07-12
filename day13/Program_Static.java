package day13;
class  UserEmployee
{
	int empId;
	String empName;
	static String CompanyName;	
}
public class Program_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserEmployee.CompanyName="Wipro";
		
		UserEmployee user1=new UserEmployee();
		user1.empId=101;
		user1.empName="Rajat";
		//user1.CompanyName="Wipro";
		System.out.println(user1.empName+":"+UserEmployee.CompanyName);
		
		UserEmployee user2=new UserEmployee();
		user2.empId=102;
		user2.empName="Ram";
		System.out.println(user2.empName+":"+user2.CompanyName);
		
		UserEmployee user3=new UserEmployee();
		user3.empId=103;
		user3.empName="Rahul";
		UserEmployee.CompanyName="Wipro pvt Limited";
		System.out.println(user3.empName+":"+user3.CompanyName);
		
		

	}

}
