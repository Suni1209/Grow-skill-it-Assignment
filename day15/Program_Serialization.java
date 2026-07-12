package day15;

import java.io.*;

class Student_G implements Serializable
{
	int rollNo;
	String name;
	transient String password;
	public Student_G(int rollNo,String name,String password) 
	{
		super();
		this.rollNo=rollNo;
		this.name=name;
		this.password=password;
	}
}
public class Program_Serialization {
//Object ---->byte stream
	public static void main(String[] args) throws Exception {
		Student_G obj=new Student_G(101,"Rahul","123456");
		File file=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\Practice.txt");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
	}

}
