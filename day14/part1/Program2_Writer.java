package day14.part1;
import java.io.*;
public class Program2_Writer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\ReadFile.txt");
		FileWriter fr=new FileWriter(file,true);
		fr.write("\nthree\nfour");
		fr.close();
	}

}
