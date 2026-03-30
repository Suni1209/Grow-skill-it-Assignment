package Assignment5;
import java.util.Scanner;
public class Program3_DigitTransformationLogic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n= sc.nextInt();
		
		int position =1;
		int result =0;
		int placeValue =1;
		
		while(n > 0) 
		{
			int digit = n % 10;
			int newDigit;
		
			if (position % 2 == 1 && digit <= 4) 
			{
				newDigit = digit * 2;
			}
			else if (position % 2 == 0) 
			{
				newDigit =1;
			}
			else 
			{
				newDigit =digit;
			}
		result =result + (newDigit * placeValue);
		placeValue *=10;
		position++;
		n=n/10;
		}
		System.out.println("output: " + result);
				
		sc.close();

	}
	
}
