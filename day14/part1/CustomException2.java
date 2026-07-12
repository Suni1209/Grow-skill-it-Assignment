package day14.part1;

public class CustomException2 {

	public static void main(String[] args) throws NegativeException{
		// TODO Auto-generated method stub
		try {
			int num=-2;
			if(num<0)
				throw new NegativeException("Less than 0 is not allowed");
			
		}
		catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
