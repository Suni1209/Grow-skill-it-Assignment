package Assignment5;
import java.util.Scanner;
public class Program2_PrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		
		for(int fact=2;fact<=n; fact++) {
		
        if(fact>n/2) {
        	break;
        }
		if(n%fact==0) { 
			boolean isPrime=true;
		
		for(int fact1=2;fact1<=fact/2; fact1++) {
			if(fact%fact1==0) {
				isPrime=false;
		       break;
			}
	
		}
		if(isPrime)	{
			System.out.print(fact + " ");
			
		}
			
	}

}
sc.close();
}
}