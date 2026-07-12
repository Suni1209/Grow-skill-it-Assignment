package day3;

public class Program6_IfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		while(num<=30) 
		{
			if(num%10==0)
				System.out.println("Bye");
			else if (num%3==0)
				System.out.println("Hello");
			else
				System.out.println(num);
			num=num+2;
		}
		

	}

}
