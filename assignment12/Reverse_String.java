package assignment12;
@FunctionalInterface
interface ReverseString
{
	String reverse(String str);
	}

public class Reverse_String {

	public static void main(String[] args) {

		        ReverseString obj = s ->
		        {
		            String rev = "";

		            for(int i = s.length()-1; i >= 0; i--)
		            {
		                rev = rev + s.charAt(i);
		            }

		            return rev;
		        };

		        String result = obj.reverse("engineer");

		        System.out.println("Input : engineer");
		        System.out.println("Output : " + result);
		    }
		
	}


