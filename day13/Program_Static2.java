package day13;

class TestData
{
	static int num1;
	int num2;
	static 
	{
		System.out.println("static block called");
	}	
	void hello()
	{
		System.out.println("hello:"+num1+num2);
		bye();
	}
static void bye()
{
	System.out.println("bye"+num1+num2);
}
public class Program_Static2 {
	int num3;
	static int num4;	
 static 
{
	System.out.println("main class loaded");
}
	public static void main(String[] args) {
		//TestData.num=10;
		TestData.bye();
		System.out.println(num4);
		System.out.println(num3);
		Program_Static2 obj=new Program_Static2();
		//return10;

	}
}
}
