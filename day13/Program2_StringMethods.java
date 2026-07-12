package day13;

public class Program2_StringMethods {

	public static void main(String[] args) {
		String str="today is friday";
		String str2="";
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('o'));
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str.length());
		System.out.println(str.replace(' ','-'));
		System.out.println(str.substring(0,5));
		System.out.println(str.toUpperCase());
		
		String str3="          today      ";
		System.out.println(str3.stripLeading());
		System.out.println(str3.stripTrailing());
		System.out.println(str3.trim());
		
		String str4="hello";
		System.out.println(str4.equalsIgnoreCase("HeLLo"));
		
		String str5="today is friday";
		String[]words=str5.split(" ");
		System.out.println(words[2]);
		//{"today", "is","friday"}
		
		
	
	}

}
