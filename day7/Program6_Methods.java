package day7;

public class Program6_Methods {

	static boolean checkEven(int num)
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	static void printEven(int num) 
	{
		if(num%2==0)
			System.out.println("EVEN NUMBER");
		else
			System.out.println("ODD NUMBER");
	}
	static float add(int num1,float num2) 
	{
		float sum=num1+num2;
		return sum;
	}
	
	public static void main (String[]args){
		boolean result=checkEven(6);
			System.out.println(result);
			printEven(21);
			float total=add(10,0.5f);
			System.out.println(total);
		
		

	}

}
