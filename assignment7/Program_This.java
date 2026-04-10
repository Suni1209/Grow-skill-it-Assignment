package assignment7;
	
	class Person 
	{
	    String name;
	    int age;
	    
	    Person(int age, String name) 
	    {
	        this.name = name;
	        this.age = age;
	    }
	    void printData() 
	    {
	        System.out.print(this.name + ":" + this.age);
	    }
	}
	class Student extends Person
	{
	    int marks;

	    Student(int age, String name, int marks) 
	    {
	        super(age, name);
	        this.marks = marks;
	    }

	    void printData() {
	        System.out.print(this.name + ":" + this.age + ":" + this.marks);
	    }
	}
	public class Program_This {
	    public static void main(String[] args) {
	        Student s = new Student(21, "Suni", 85);
	        s.printData();
	    }
	}