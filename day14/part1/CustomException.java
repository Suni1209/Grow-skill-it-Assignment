package day14.part1;

public class CustomException {
	static  void checkAge(int age)throws Exception
	{
		if(age<18)
			throw new Exception("underage");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			checkAge(16);
		}
		catch(Exception ex)
		{
			System.out.println("Exception Occured:"+ex.getMessage());
		}
		

	}

}
