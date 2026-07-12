package day14.part1;

public class Program_Exception {
	static void checkAge(int age)throws Exception 
	{
		if (age<18)
			throw new Exception("Underage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			//TODO Auto generated catch block
			e.printStackTrace();
		}
		try {
		
		System.out.println("Hello");
		checkAge(16);
		int num=10/10;
		int arr[]= {10,20,30};
		
		//System.out.println(arr[10]);
		System.out.println("Bye");
	}
	catch(ArrayIndexOutOfBoundsException ex)
		{
		System.out.println("ArrayIndexOutOfBoundsException Exception Ocuured:"+ex.getMessage());
		}
	catch(Exception ex) 
	{
		System.out.println("Exception occured:"+ex.getMessage());

	}

	}
}
