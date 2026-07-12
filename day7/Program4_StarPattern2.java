package day7;
public class Program4_StarPattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r=1;r<=5;r++)
		{
			for(int star=1;star<=6-r;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
