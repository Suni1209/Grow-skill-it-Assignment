package DoubtSession;

public class Program3_ReversingANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	    int num=1234,reverse=0;
		
		for(;num!=0; num=num/10)
		{
			int digit=num%10;
			
			System.out.println(digit);
			reverse=reverse*10+ digit;//reverse=4;reverse=43;reverse=432;reverse=4321
		}       
		System.out.println(reverse);
		 while(num!=0) {
         int digit =num % 10;
        System.out.println(digit);
        reverse = reverse*10 + digit;//reverse=4;reverse=43;reverse=432;reverse=4321
        System.out.println(reverse);
        num=num/10;
	}
	}
}
