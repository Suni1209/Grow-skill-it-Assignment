package day2;

public class Program9_Case {

	public static void main(String[] args) {
		char ch='A';
		if(ch>='A'  && ch<='Z')
			System.out.println("Uppercae");
		else if (ch>='a'  &&  ch<='z')
			System.out.println("Lowercase");
		else if (ch>='0' && ch<='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");

	}

}
