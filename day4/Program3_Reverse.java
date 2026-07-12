package day4;

public class Program3_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int reverse=0;
		while(num>0) 
		{
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
        System.out.println(reverse);
	}

}
