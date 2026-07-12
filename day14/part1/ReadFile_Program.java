package day14.part1;

import java.io.*;

public class ReadFile_Program {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\ReadFile.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String st="";
		while((st=br.readLine())!=null) 
		{
			System.out.println(st);
		}
		br.close();
		


	}

}
