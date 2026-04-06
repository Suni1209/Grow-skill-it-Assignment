package Assignment5;
import java.util.Scanner;
public class Program1_FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of terms");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+ b + " ");
		for(int i=2;i<n; i++) 
		{
			int c=a+b;
			if(c>100) 
			 break;
		
		
		System.out.print(c + " ");
		a=b;
		b=c;
	}
		}	

}				
		

	


