package assignment12;
import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String  productName;
	double price;
	
	Product (int id,String productName,double price)
	{
		this.id=id;
		this.price=price;
		this.productName=productName;
		
	}
	public String toString() 
	{
		return id+ " "+productName + " "+price;
		
	}
}

public class Program_Filter {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		
		list.add(new Product(101,"Laptop",55000));
		list.add(new Product(102,"Mouse",700));
		list.add(new Product(103,"Mobile",25000));
		list.add(new Product(104,"Keyboard",900));
		
		List<Product>result=list
				.stream()
				.filter(p->p.price>1000)
				.toList();
		System.out.println("Product whose price is greater than 1000");
		result.forEach(System.out::println);
				
		
		

	}

}
