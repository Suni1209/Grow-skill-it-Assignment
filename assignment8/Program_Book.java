package assignment8;
class Book
{
 String title;
 String author;

 
 static String libraryName = "City Library";

 // final variable
 final int ISBN = 12345;

 
 Book(String title, String author) 
 {
     this.title = title;
     this.author = author;
 }
 
 public Book() {
	
}
 void print() 
 {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
 }

 
 String getDescription() 
 {
     return "This is a physical book.";
 }

 
 static void showLibrary() 
 {
     System.out.println("Library: " + libraryName);
 }
}


class EBook extends Book {
 int fileSize;

 
 EBook(String title, String author, int fileSize) 
 {
     super(title, author);
     this.fileSize = fileSize;
 }

 
 void print() 
 {
     super.print();
     System.out.println("File Size: " + fileSize + "MB");
 }


 @Override
 String getDescription() 
 {
     return "This is an electronic book.";
 }
}


public class Program_Book {

	public static void main(String[] args) {

     
     EBook e = new EBook("Atomic Habits", "James Clear", 5);
     e.print();

     System.out.println();

     
     Book b = new Book();
     System.out.println(b.getDescription());
     System.out.println(e.getDescription());

     System.out.println();
     
     Book.showLibrary();

     System.out.println();
     
     System.out.println("ISBN: " + b.ISBN);
     
      //b.ISBN = 99999;

     System.out.println();

     
     String input = "Java Programming";

     System.out.println("Uppercase: " + input.toUpperCase());
     System.out.println("Length: " + input.length());
     System.out.println("Contains Java: " + input.contains("Java"));
 }
}
