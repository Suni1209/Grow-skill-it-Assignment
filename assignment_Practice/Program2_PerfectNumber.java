package assignment_Practice;

public class Program2_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int sum=0;
		for(int i=1;i<=n/2; i++) 
		{
		if (n%i==0) {
			sum=sum+i;
		}
		}
		if(sum==n) {
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
		
		

	}

}
