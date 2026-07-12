package day4;

public class Program6_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1001;
		int originalNum=num;
		int reverse=0;
		for(;num>0;num=num/10) 
		{
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
		}
        System.out.println(reverse);
        if(reverse==originalNum)
        	System.out.println("Palindrome");
        else
        	System.out.println("Not Palindrome");
	}

}
