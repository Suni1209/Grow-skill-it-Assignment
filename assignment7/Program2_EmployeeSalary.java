package assignment7;


class Employee 
{
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) 
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    double calculateSalary() 
    {
        double hra = 0.20 * this.basicSalary;
        double bonus = 0.10 * this.basicSalary;
        double totalSalary = this.basicSalary + hra + bonus;
        return totalSalary;
    }

    
    void printData() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
    
public class Program2_EmployeeSalary {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Suni", 20000);
        e.printData();

	}

}
