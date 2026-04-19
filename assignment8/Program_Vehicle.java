package assignment8;

class Vehicle {
 String brand;
 int speed;

 
 static String company = "AutoWorld Ltd";

 
 Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 
 void print() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed);
 }

 
 void run() {
     System.out.println("Vehicle is running");
 }

 
 final void engineType() {
     System.out.println("Engine type: Standard Engine");
 }

 
 static void printCompany() {
     System.out.println("Company: " + company);
 }
}


class Car extends Vehicle {
 String fuelType;

 
 Car(String brand, int speed, String fuelType) {
     super(brand, speed);
     this.fuelType = fuelType;
 }

 
 void print() {
	 super.print();
     System.out.println("Fuel Type: " + fuelType);
 }

 
 @Override
 void run() {
     System.out.println("Car is running smoothly");
 }

 // ❌ Cannot override final method (will give error)
 /*
 @Override
 void engineType() {
     System.out.println("Modified Engine");
 }
 */
}


public class Program_Vehicle {

	public static void main(String[] args) {
     
     Car car= new Car("Hyundai", 120, "Petrol");
     car.print();
     System.out.println();

     
     Vehicle vehicle = new Vehicle("Generic", 80);
     vehicle.run();
     car.run();

     System.out.println();

     
     Vehicle.printCompany();

     System.out.println();

     
     vehicle.engineType();
     System.out.println("Error: cannot override final method");

     System.out.println();

     
     String brand = "Hyundai";

     
     String reversed = new StringBuilder(brand).reverse().toString();
     System.out.println("Reversed: " + reversed);

     
     String replaced = brand.replaceAll("[aeiouAEIOU]", "*");
     System.out.println("Replaced: " + replaced);

     
     System.out.println("Equals Hyundai: " + brand.equals("Hyundai"));
 }
}


		


