package day8;

import day12.TestAccess;

public class Program1_Object extends TestAccess {

	public static void main(String[] args) {
		
		//student class
		//s1 is object
		//new gives memory to object
		//student() is constructor
		//int num=10;
		Student s1=new Student();
		s1.name="Rajat";
		s1.age=30;
		s1.yearsOfExperience=7;
		s1.checkExperience();
		System.out.println(s1.name+":"+s1.age+":"+s1.yearsOfExperience);
        Student	s2=new Student("Rahul",28,12.7F);
        System.out.println(s2.name+":"+s2.age+":"+s2.yearsOfExperience);
        Student s3=new Student();
        s3.setName("Pooja");
        System.out.println(s3.getName());
        
        Program1_Object obj=new Program1_Object();
		
		
		
		
        
		
	}

}
