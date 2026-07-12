package day11;

public class Program1_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productCode1="Amz111";
		String productCode2="z101";
		String productCode3="pz101";
		String regex1="^[Amz].*";
		//start with either A or m or z
		//System.out.println(productCode1.matches(regex1));
		
		
		//start with Amz
		String regex2="^Amz.*";
		//System.out.println(productCode1.matches(regex2));
		
		//start with Amz 3 digit number
		String regex3="^Amz[0-9]{3}$";
		System.out.println(productCode1.matches(regex3));
		
		//start with Amz 3 digit number using 0 to 5 and end
		
		String regex4="^Amz[0-5]{3}$";
		System.out.println(productCode1.matches(regex4));
		
		// start with Amz 2 or 3 digit number using 0 to 5 and end
		String regex5="^Amz[0-5]{2,3}$";
		System.out.println(productCode1.matches(regex5));
		//
		String regex6=".*Amz[0-5]{2,3}.*";
		System.out.println(productCode1.matches(regex6));
		
		//3-6 characters start
		//_ is optional
		//2digit or 3 digit  number
		//@infosys.comEND
		
		String email="aBcdef12@infosys.com";
		String regexP="^[A-Za-z]{3,6}_[0-9]{2,3}@infosys.\\s+com$";
		System.out.println(email.matches(regexP));
		
		String phoneNumber="98765432101";
		String regexPhone="^[6-9]{1}[0-9]{9}$";
		System.out.println(phoneNumber.matches(regexPhone));
		
		
		
		

	}

}
