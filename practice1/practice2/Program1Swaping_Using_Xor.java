package practice1.practice2;

public class Program1Swaping_Using_Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=7;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a= "+a+" b="+b);

	}

}
