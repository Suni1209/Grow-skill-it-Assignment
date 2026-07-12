package day11;

public class Program_Wrapper {

	public static void main(String[] args) {
		int num=10;
		String str="123";
		num=Integer.parseInt(str);
		System.out.println(num);
		
		boolean result=Character.isDigit('A');
		System.out.println(result);
		
		boolean result2=Character.isDigit('5');
		System.out.println(result2);

	}

}
