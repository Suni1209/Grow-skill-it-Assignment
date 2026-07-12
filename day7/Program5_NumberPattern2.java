package day7;

public class Program5_NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
			
		System.out.print(num+" ");
		num++;
			}
			System.out.println();
		}
	}

}
