package day14;
import java.util.*;
public class Program_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Integer Input:"+num);
		String str=sc.next();
		System.out.println("String Input:"+str);
		float marks=sc.nextFloat();
		System.out.println("Float Input:"+marks);
		sc.next();
		String line=sc.nextLine();
		System.out.println("Line Input:"+line);
		char alpha=sc.next().charAt(0);
		System.out.println("Char Input:"+alpha);
		boolean result=sc.nextBoolean();
		System.out.println("Boolean Input:"+result);
		sc.close();
		
		
		

	}

}
