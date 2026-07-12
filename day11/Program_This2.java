package day11;
class UserG
{
	int id;
	//String residentOfCountryCurrentLivingIn;
	String name;
	UserG()
	{
		this(102,"Palak");
		System.out.println("constructor 1 called");
	}
	UserG(int id,String name)
	{
		
		this.id=id;
		this.name=name;
		System.out.println("constructor 2 called");
		
	}
	void print() 
	{
		//this();
		System.out.println(this.id+":"+this.name);
	}
	
}

public class Program_This2 {

	public static void main(String[] args) {
		UserG obj=new UserG();
		obj.print();

	}

}
