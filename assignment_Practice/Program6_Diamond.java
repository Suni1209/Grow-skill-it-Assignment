package assignment_Practice;

public class Program6_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int r=1;r<=5;r++)
		{
			for (int sp=1;sp<=5-r;sp++)
				System.out.print(" ");
			for(int star=1;star<=2*r-1;star++)
				System.out.print("*");
			System.out.println();
		}
		for(int r=1;r<=4;r++)
		{
			for(int sp=1;sp<=r;sp++)
				System.out.print(" ");
			for(int star=1;star<=9-2*r;star++)
				System.out.print("*");
			System.out.println();
					
		}

	}

}
