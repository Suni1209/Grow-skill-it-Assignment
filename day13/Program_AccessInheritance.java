package day13;
class parent
{
	final int num=10;
	protected void print() 
	{
		System.out.println("Hello");
	}
}
class child extends parent
{
	void bye() 
	{
		this.num=20;
	}
	void print() 
	{
		System.out.println("Hello");
	}
}


public class Program_AccessInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
