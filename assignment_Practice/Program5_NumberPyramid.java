package assignment_Practice;

public class Program5_NumberPyramid {
	  			    // Method as required
			    public static void printNumberPyramid(int n) {

			        for (int i = 1; i <= n; i++) {

			            // 1. Print spaces
			            for (int sp = 1; sp <= n - i; sp++) {
			                System.out.print(" ");
			            }

			            // 2. Print increasing numbers
			            for (int j = 1; j <= i; j++) {
			                System.out.print(j);
			            }

			            // 3. Print decreasing numbers
			            for (int j = i - 1; j >= 1; j--) {
			                System.out.print(j);
			            }

			            // Move to next line
			            System.out.println();
			        }
			    }

			    // Main method
			    public static void main(String[] args) {
			        printNumberPyramid(5);   // method call
			    }
			}