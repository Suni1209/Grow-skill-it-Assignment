package day5;

public class Program6_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10;
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		int i=1;
		count=count-2;
		while(i<=count)
		{
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			i++;
		}

	}

}
