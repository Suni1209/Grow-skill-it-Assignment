package day1;
public class Program5_TypeCasting {
	public static void main(String[] args) {
		
		//DOWNCASTING OR EXPLICIT TYPE CONVERSION
		float height=162.5f;
		int heightInt=(int)height;
		System.out.println(height);
		
		//upcasting=IMPLICIT TYPE CONVERSION
		int age=32;
		float ageFloat=age;
		System.out.println(ageFloat);
		
		int num=100;
		long numLong=num;
		System.out.println(numLong);
		
		long phoneNumber=9876543210909L;
		int phoneInt=(int)phoneNumber;
		System.out.println(phoneInt);
		
		
		float marks = 87.6f;
		int marksInt=(int)marks;
		System.out.println("Float value:"+marks);
		
        double doubleMarks = marks;
        int intMarks = (int) doubleMarks;
        char characterValue = (char) intMarks;
        System.out.println("Float value: " + marks);
        System.out.println("Double value: " + doubleMarks);
        System.out.println("Integer value: " + intMarks);
        System.out.println("Character value: " + characterValue);
		
		

	}

}
