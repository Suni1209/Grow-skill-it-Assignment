package day11;

import java.util.ArrayList;

class Employee
{
	private int empId;
	private String name;
	Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	int getEmpId() 
	{
		return this.empId;
	}
	String getName() 
	{
		return this.name;
	}
}

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee>List=new ArrayList<Employee>();
		Employee e1=new Employee(101,"Rajat");
		Employee e2=new Employee(102,"Rahul");
		Employee e3=new Employee(103,"Shreya");
		List.add(e1);List.add(e2);List.add(e3);
		//int arr[]= {10,20,30};
		//for(int num:)
		for(Employee e:List)
		{
			System.out.println(e.getEmpId()+":"+e.getName());
		}
		

	}

}
