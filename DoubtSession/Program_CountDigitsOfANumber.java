package DoubtSession;

public class Program_CountDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12378,count =0,primeCount=0,primeNum=12378;
		while(num!=0) {
			num=num/10;
			//num=num/10;
			
			num /=10;//compound statement
			count++;
		}
		System.out.println(count);
		while(num!=10) {
			int digit =num%10;
			if(digit==2||digit==3|| digit==5||digit==7) {
		     primeCount++;
		     
			}
			primeNum /=10;
			 
		}
		System.out.println(primeCount);
	}
}

	


