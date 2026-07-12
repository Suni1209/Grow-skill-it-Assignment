package day2;

public class Program8_MultipleOFTwo {

	public static void main(String[] args) {
		int num=20;
		if(num%2==0  &&  num%10!=0)
		    System.out.println("Multiple of 2");
		else if(num%10==0)
		    System.out.println("Multiple of 10");
		else
			System.out.println("Not multiple of 2");

	}

}
