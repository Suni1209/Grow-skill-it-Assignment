package day9;
class parent
{
	String house;	
}
class child extends parent
{
	String car;
}
class GrandChild extends child
{
	String bicycle;
}

public class Program_Multilevel {

	public static void main(String[] args) {
		GrandChild grandChild=new GrandChild();
		grandChild.house="3BHK";
		grandChild.car="Creta";
		grandChild.bicycle="Hero";
		
		child child=new child();
		child.house="2BHK";
		child.car="Tata punch";
	}

}
