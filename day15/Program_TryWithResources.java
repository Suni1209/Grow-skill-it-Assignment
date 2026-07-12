package day15;

import java.io.File;
import java.io.FileWriter;

public class Program_TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\ReadFile.txt");
		try(FileWriter fr=new FileWriter(file,true)) 
		{
		fr.write("\nthree\nfour");
		//fr.close();
		}
		catch(Exception ex)
		{
			
		}
	}

	}


