package assignment_Practice;

public class Program7_AreaCalculator {
		    // Circle
		    double area(double radius) {
		        return Math.PI * radius * radius;
		    }

		    // Rectangle
		    int area(int length, int breadth) {
		        return length * breadth;
		    }

		    // Square
		    int area(int side) {
		        return side * side;
		    }

		    public static void main(String[] args) {

		    	Program7_AreaCalculator obj = new Program7_AreaCalculator();

		        // Circle
		        double circleArea = obj.area(5.0);
		        System.out.println("Area of Circle = " + circleArea);

		        // Rectangle
		        int rectangleArea = obj.area(4, 6);
		        System.out.println("Area of Rectangle = " + rectangleArea);

		        // Square
		        int squareArea = obj.area(4);
		        System.out.println("Area of Square = " + squareArea);
		    }
		}
		
		

	


