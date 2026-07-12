package day8;

public class Student {
	String name;
	int age;
	float yearsOfExperience;
	void checkExperience() 
	{
		if(yearsOfExperience>=5) 
		
			System.out.println("EXPERIENCED");
		else
			System.out.println("LES EXPERIENCED");
	}
	Student()
	{
		System.out.println("CONSTRUCTOR CALLED");
	}
	Student(String name1,int age1,float yoe)
	{
		//INITIALIZE VARIABLES OF CLASS
		name=name1;
		age=age1;
		yearsOfExperience=yoe;
		System.out.println("CONSTRUCTOR CALLED!");
	}
		
		String getName() 
		{
			return name;
		}
		void setName(String name1) 
		{
			name=name1;
			
		}
		int getAge() 
		{
			return age;
		}
		void setAge(int age1) 
		{
			age=age1;
		}
		float getYearsOfExperience() 
		{
			return yearsOfExperience;
		}
	}


