package day15;
@FunctionalInterface
interface ITest
{
	String hello(String name);
}

public class Program_FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITest obj=(n)->
		{
			return "hello"+n;
		};
		String output=obj.hello("GSIT Admin");
		System.out.println(output);

	}

}
