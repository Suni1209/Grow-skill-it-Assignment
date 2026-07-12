package day15;
class Student_M
{
	int rollno;
	String name;
	Grade grade;
	
}
public class Program_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_M obj=new Student_M();
		obj.rollno=101;
		obj.name="Rahul";
		obj.grade=Grade.A;
		
		System.out.println(obj.rollno+":"+obj.name+":"+obj.grade);

	}

}
