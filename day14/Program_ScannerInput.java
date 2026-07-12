package day14;

import java.util.Scanner;

public class Program_ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]data=new String[6];
		String output="";
		Scanner sc=new Scanner(System.in);
		for(String str:data) 
		{
			str=sc.next();
			output=output+" "+str;
		}
		System.out.println(output.trim());

	}

}
