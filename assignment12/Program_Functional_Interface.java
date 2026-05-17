package assignment12;

@FunctionalInterface
interface UpperCaseConverter
{
	String Convert(String str);	
	
}

public class Program_Functional_Interface {

	public static void main(String[] args) {
		
		UpperCaseConverter obj=s->s.toUpperCase();
		String result=obj.Convert("hello java");
		System.out.println("Input:hello java");
		System.out.println("Output:" +result);

	}

}
