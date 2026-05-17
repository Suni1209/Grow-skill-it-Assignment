package assignment12;
import java.util.function.*;
public class Program_CountVowels {

	public static void main(String[] args) {
		Function<String,Integer>obj=str->
		{
			int count =0;
			str=str.toLowerCase();
			for(int i=0;i<str.length();i++)
			{
				char ch= str.charAt(i);
				
				 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	                {
	                    count++;
	                }
	            }

	            return count;
	        };

	        int result = obj.apply("automation");

	        System.out.println("Input : automation");
	        System.out.println("Output : " + result);
			
		

	}

}
