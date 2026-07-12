package day15;
class Demo5
{
	private static Demo5 obj;
	private Demo5() 
	{
	
	}
	static Demo5 getObj() 
	{
		if (obj==null)
		{
			obj=new Demo5();
			return obj;
		}
		else
			return obj;
	}
}

public class Singleton_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 obj1=Demo5.getObj();
		Demo5 obj2=Demo5.getObj();
		if(obj1==obj2)
			System.out.println("Same Object");
		
		

	}

}
