package practice1.practice2;

public class ReverseString_withoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Interview";
		String reversed =" ";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			reversed= reversed +str.charAt(i);
		}
		System.out.println(reversed);

	}

}
