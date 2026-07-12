package day13;
class UserData1
{
	int id;
	static void hello() 
	{
		System.out.println("hello");
	}
}
class UserData2 extends UserData1
{
	String name;
	static void hello()
	{
		System.out.println("Bye");
	}
public class PProgram_StaticPolymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserData1 obj=new UserData2();
		obj.hello();

	}

}
}
