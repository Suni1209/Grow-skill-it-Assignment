package day12;
abstract class Rating
{
	abstract void rating();
	void print() 
	{
		System.out.println("hello");
	}
}
class ElectronicRating extends Rating
{
	void rating() 
	{
		System.out.println("3 stars");
	}
}
public class Program_Abstract {
	public static void main(String[] args) {	
		ElectronicRating obj=new ElectronicRating();
		

	}

}
