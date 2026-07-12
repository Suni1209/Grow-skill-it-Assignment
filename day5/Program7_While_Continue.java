package day5;
public class Program7_While_Continue {
	public static void main(String[] args) {
	System.out.println("Hello");
	int num=0;
	while(num<=9)
	{
		num++;
		if (num==5)
			continue;
	        System.out.print(num+" ");
	}
    System.out.println("\nBye");
	}

}
