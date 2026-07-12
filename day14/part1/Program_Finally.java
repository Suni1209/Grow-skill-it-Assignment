package day14.part1;

public class Program_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			//int num=10/0;
			System.out.println("Bye");
			System.exit(0);
		}
		catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
			
		}
		finally
		{
			System.out.println("I will always execute");
		}

	}

}
