package day10;

class StudentUser
{
    int enrollNo;
	String name;
	int age;
	StudentUser()
	{
		System.out.println("PARENT CONSTRUCTOR CALLED");
	}
	StudentUser(int enrollNo)
	{
		System.out.println("PARAMETERIZED PARENT CONSTRUCTOR CALLED");
		this.enrollNo=enrollNo;
	}	
}
class EngineeringStudent extends StudentUser
{
	String course="Btech";
	void printData() 
	{
		System.out.println(this.enrollNo+":"+this.name+":"+this.course);
		if(super.age>25)
			System.out.print(":Late Admission");	
		
	}
	EngineeringStudent()
	{
		super(-);
		System.out.println("CHILD CONSTRUCTOR CALLED");
	}
}
public class Program_Super{
	public static void main(String[] args) {
		EngineeringStudent user=new EngineeringStudent();
		user.enrollNo=101;
		user.name="Rajat";
		user.age=26;
		user.printData();
		//this CHAISING

	}

}
