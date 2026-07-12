package DoubtSession;

public class Program5_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 37;boolean isPrime=false;
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				isPrime =true;
				break;
			}
		}
		if(isPrime == true)
		System.out.println("Its not prime");
		else
			System.out.println("Its a Prime");
		

	}

}
