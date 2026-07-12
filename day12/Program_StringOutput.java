package day12;

public class Program_StringOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="hello";
		String str3=new String("hello");
		String str4=new String("hello");
		
		if (str1==str2)
			System.out.println("Output 1");
		if(str1.equals(str2))
			System.out.println("Output 2");
		if(str3==str4)
			System.out.println("Output 3");
		if(str3.equals(str4))
			System.out.println("Output 4");
		

	}

}
