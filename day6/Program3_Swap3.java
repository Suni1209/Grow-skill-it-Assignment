package day6;

public class Program3_Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		int num2=3;
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);

	}

}
