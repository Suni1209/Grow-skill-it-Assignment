package assignment10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Book
{
	int bookId;
	String bookName;
	int price;
	
	Book(int bookId,String bookName,int price) 
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;	
	}
}

public class Program_BookManagement {

	public static void main(String[] args) {
		
		ArrayList<Book> list=new ArrayList<>();
		
		list.add(new Book(101,"Java",499));
		list.add(new Book(102,"Python",399));
		list.add(new Book(101,"SQL",299));
		list.add(new Book(101,"C++",599));
		
		System.out.println("Original List:");
		print(list);
		Collections.sort(list,new Comparator<Book>()
		{
		public int compare(Book b1,Book b2) 
		{
			return b1.price-b2.price;
		}
		});
		System.out.println("/nAfter sorting by price");
		print(list);
		list.removeIf(b->b.bookId==102);
		System.out.println("/nAfter Removing Book ID102:");
		print(list);
		for(Book b:list) 
		{
			if(b.bookId==103) 
			{
				b.price=349;
			}
			
		}
		System.out.println("/nAfter Updating price:");
		print(list);
		String searchName="Java";
		for(Book b:list) 
		{
			if(b.bookName.equalsIgnoreCase(searchName)) 
			{
				System.out.println("/nBook Found:"+b.bookName);
			}
		}
		System.out.println("/nFinal List:");
		print(list);
	}
	public static void print(ArrayList<Book>list) 
	{
		for(Book b:list) 
		{
			System.out.println(b.bookId +" "+b.bookName +" "+b.price);
		}
		

	}

}
