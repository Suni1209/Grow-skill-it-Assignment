package day7;
public class Program7_Polymorphism {
	static int globalData=-10;
	 static void add()
	 {
		 int newdata=-100;
		 System.out.println(10+globalData);
	 }
	 static void add(int num) 
	 {
		 System.out.println(num);
	 }
	 static void add(int num1,int num2)
	 {
		 System.out.println(num1+num2);
	 }
	 static void add(int num1,float num2) 
	 {
		 System.out.println(num1+num2);
	 }
	  public static void main(String[] args) {
		  add();
		  add(20);
		  add(20,20);
		  add(10,0.5F);
		
		

	}

}
