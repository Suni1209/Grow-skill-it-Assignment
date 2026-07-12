	package day15;
	
	import java .io.File;
	import java.io.*;
	import java.io.ObjectOutputStream;
	
public class program_deserialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	File file=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\Practice.txt");
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student_G obj=(Student_G)ois.readObject();
	System.out.println(obj.rollNo+":"+obj.name+":"+obj.password);
		

	}

}
