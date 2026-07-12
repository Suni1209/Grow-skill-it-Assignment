package day7;
public class Program8_PassByValue {
	static void incByFive(int num) 
	{
		num=num+5;
		System.out.println("INSIDE METHOD:"+num);
	}
	static void incByTwo(int[]num2)
	{
		num2[0]=num2[0]+2;
		System.out.println("INSIDE METHOD:"+num2[0]);
	}
	public static void main(String[] args) {
		int num=10;
		int[]data= {10,20};
		incByFive(num);
		System.out.println("NEW VALUE OF NUM:"+num);
		incByTwo(data);
		System.out.println("NEW VALUE OF ARRAY:"+data[0]);
		

	
	

	}

}
