package test_cases;

import java.util.Properties;
import java.io.*;

public class ReadFile {
	
	public static void main(String[]args) throws Exception{
		
		Properties prop=new Properties();
		prop.load(new FileInputStream
				("C:\\Users\\deepa\\eclipse-workspace\\growskillit\\src\\test_cases\\data.properties"));
				System.out.println("url");

}
}