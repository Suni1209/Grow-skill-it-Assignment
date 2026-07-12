package day7;

public class Program1_LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int row=1;row<=5;row++) 
		{
			for(int sp=1;sp<=5-row;sp++) 	
				System.out.print(" ");
			for(int star =1;star<=row;star++)
			System.out.print("* ");
		System.out.println();	
		}

	}

}
