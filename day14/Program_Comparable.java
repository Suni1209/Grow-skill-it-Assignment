package day14;
import java.util.*;
class StudentK implements Comparable<StudentK>
{
	int rollNo;
	String name;
	public StudentK(int rollNo,String name) 
	{
		super();
		this.rollNo=rollNo;
		this.name=name;
	}
	/* public int compareTo(StudentK ob) 
	{
		//return ob.rollNo-this.rollNo;
		//return this.name.compareTo(ob.name);
		return ob.name.compareTo(this.name);
		
	}*/
}
class StudentKComparator implements Comparator<StudentK>
{
	public int compare(StudentK ob1,StudentK ob2) 
	{
		return ob1.rollNo-ob2.rollNo;
	}
}
public class Program_Comparable {
	public static void main(String[] args) {
		
		StudentK obj1=new StudentK(3,"Astha");
		StudentK obj2=new StudentK(1,"Zeenat");
		StudentK obj3=new StudentK(2,"Mehak");
		ArrayList<StudentK>list=new ArrayList<StudentK>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		Collections.sort(list,new StudentKComparator());
		for(StudentK obj:list)
		{
		
			System.out.println(obj.rollNo+":"+obj.name);
		}

	}

}

